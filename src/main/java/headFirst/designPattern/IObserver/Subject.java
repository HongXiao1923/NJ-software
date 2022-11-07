package headFirst.designPattern.IObserver;

/**
 * @author Einstein
 * @version 1.0
 * @description 气象站总接口
 * @date 2022/11/7 16:03
 */
public interface Subject {
    public void registerObserver(Observer o);   //注册观察者
    public void removeObserver(Observer o);     //移除观察者
    public void notifyObservers();              //通知观察者
}
