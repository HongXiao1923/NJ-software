package headFirst.designPattern.eSingleton;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/18 16:13
 * @see
 */
public class EagerlySingleton {

    //运行时，Java 虚拟机只为静态变量分配一次内存，在加载类的过程中完成静态变量的内存分配
    //它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化
    public static EagerlySingleton uniqueInstance = new EagerlySingleton();

    private EagerlySingleton(){}

    public static EagerlySingleton getInstance(){
        return uniqueInstance;
    }
}
