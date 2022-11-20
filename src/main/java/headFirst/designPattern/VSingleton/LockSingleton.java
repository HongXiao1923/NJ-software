package headFirst.designPattern.VSingleton;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/18 16:20
 * @see
 */
public class LockSingleton {
    private static LockSingleton uniqueInstance;

    private LockSingleton(){}

    public static synchronized LockSingleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new LockSingleton();
        }
        return uniqueInstance;
    }
}
