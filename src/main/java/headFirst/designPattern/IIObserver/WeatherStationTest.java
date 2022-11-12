package headFirst.designPattern.IIObserver;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/7 16:30
 * @see
 */
public class WeatherStationTest {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        //虚拟的气象数据
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(85, 60, 33.2f);
        weatherData.setMeasurements(78, 55, 28.6f);
    }
}
