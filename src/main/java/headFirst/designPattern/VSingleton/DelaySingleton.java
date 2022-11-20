package headFirst.designPattern.VSingleton;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/18 16:09
 * @see
 */
public class DelaySingleton {
    private static DelaySingleton uniqueInstance;

    private DelaySingleton(){
        //私有化构造器
    }

    /**
     * 实例化方法
     * @return
     */
    public static DelaySingleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new DelaySingleton();
        }
        return uniqueInstance;
    }
}
