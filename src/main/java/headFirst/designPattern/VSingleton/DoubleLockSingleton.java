package headFirst.designPattern.VSingleton;

/**
 * @author Einstein
 * @version 1.0
 * @description 双重检验加锁（有点“杀鸡用牛刀”的感觉）
 * @date 2022/11/18 16:15
 * @see
 */
public class DoubleLockSingleton {

    //volatile 保证顺序性（第一次加锁）
    private volatile static DoubleLockSingleton uniqueInstance;

    private DoubleLockSingleton(){}

    /**
     * 为延迟加载方式加上双重锁（第二次加锁）
     * @return
     */
    public static DoubleLockSingleton getInstance(){
        if(uniqueInstance == null){
            synchronized (DoubleLockSingleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new DoubleLockSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
