package softwareEngineering.software.designPattern.build.singleton;

/**
 * @author Einstein
 * @version 1.0
 * @description 直接初始化静态变量
 * @date 2022/10/21 17:16
 * @see
 */
public class InitSingleton {
    /*
     * 利用静态变量来记录Singleton的唯一实例
     * 直接初始化静态变量，这样就可以确保线程安全了
     */
    private static InitSingleton uniqueInstance = new InitSingleton();

    /*
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private InitSingleton(){

    }

    public static InitSingleton getInstance(){
        return uniqueInstance;
    }

}
