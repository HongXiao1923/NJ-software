package headFirst.designPattern.IObserver;

/**
 * @author Einstein
 * @version 1.0
 * @description 观察者总接口
 * @date 2022/11/7 16:05
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
