package softwareEngineering.software.designPattern.build.singleton;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/10/21 17:07
 * @see
 */
public class Singleton {
    //利用静态变量来记录Singleton的唯一实例
    private static Singleton uniqueInstance;

    /*
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private Singleton(){

    }

    /**
     * 对外提供唯一一个访问接口
     * @return
     */
    public static Singleton getInstance(){
        if(uniqueInstance == null){             //这地方在多线程并发访问时可能会出现问题
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

}
