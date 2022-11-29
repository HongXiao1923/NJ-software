package headFirst.designPattern.VSingleton;

/**
 * @author Einstein
 * @version 1.0
 * @description 这种单例在多线程模式下是错的，不符合竞价条件
 * @date 2022/11/18 16:09
 * @see
 */
public class DelaySingleton {
    private static DelaySingleton uniqueInstance;

    private DelaySingleton(){
        //私有化构造器
    }

    /**
     * 懒汉方式：实现延迟加载，线程不安全
     * @return
     */
    public static DelaySingleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new DelaySingleton();
        }
        return uniqueInstance;
    }
}
