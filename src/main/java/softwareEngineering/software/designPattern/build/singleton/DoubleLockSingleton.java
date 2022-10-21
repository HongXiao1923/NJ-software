package softwareEngineering.software.designPattern.build.singleton;

/**
 * @author Einstein
 * @version 1.0
 * @description 双重检查加锁
 * @date 2022/10/21 17:19
 * @see
 */
public class DoubleLockSingleton {
    /*
     * 利用静态变量来记录Singleton的唯一实例
     * volatile 关键字确保：当uniqueInstance变量被初始化成Singleton实例时，
     * 多个线程正确地处理uniqueInstance变量
     *
     */
    private volatile static DoubleLockSingleton uniqueInstance;

    /*
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private DoubleLockSingleton(){

    }

    /**
     * 检查实例，如果不存在，就进入同步区域
     * @return
     */
    public static DoubleLockSingleton getInstance(){
        if(uniqueInstance == null){
            synchronized(DoubleLockSingleton.class){          //进入同步区域
                if(uniqueInstance == null){         //在检查一次，如果为null，则创建
                    uniqueInstance  = new DoubleLockSingleton();
                }
            }
        }

        return uniqueInstance;
    }

}
