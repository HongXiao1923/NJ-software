package headFirst.designPattern.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Einstein
 * @version 1.0
 * @description 气象站（作为发布者）
 * @date 2022/11/7 16:07
 * @see
 */
public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当气象站得到最新的测量值时，启动通知
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    /**
     * 此处可以升级：自行去网站上拉取数据
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
