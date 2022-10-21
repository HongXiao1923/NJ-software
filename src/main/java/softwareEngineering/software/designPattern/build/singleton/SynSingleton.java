package softwareEngineering.software.designPattern.build.singleton;

/**
 * @author Einstein
 * @version 1.0
 * @description 为访问接口方法添加同步锁
 * @date 2022/10/21 17:14
 * @see
 */
public class SynSingleton {
    //利用静态变量来记录Singleton的唯一实例
    private static SynSingleton uniqueInstance;

    /*
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private SynSingleton(){

    }

    public static synchronized SynSingleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SynSingleton();
        }

        return uniqueInstance;
    }

}