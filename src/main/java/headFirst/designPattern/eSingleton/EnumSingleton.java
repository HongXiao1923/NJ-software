package headFirst.designPattern.eSingleton;

/**
 * @author Einstein
 * @version 1.0
 * @description Java保证枚举类的每个枚举都是单例
 * @date 2022/11/29 16:35
 */
public enum EnumSingleton {
    //唯一枚举
    UNIQUE_INSTANCE;

    private String name = "EnumSingleton";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
