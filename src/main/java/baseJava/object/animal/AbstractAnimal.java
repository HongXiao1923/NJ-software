package baseJava.object.animal;

/**
 * @author Einstein
 * @version 1.0
 * @description 以动物例子演示抽象类
 * @date 2022/11/4 18:34
 * @see
 */
public abstract class AbstractAnimal {
    public String name;     //名字
    public String area;     //地区

    /**
     * 动物有几条腿呢？
     * @return
     */
    public abstract int legs();

    /**
     * 动物有都会飞吗，会飞这个属性和地区有关系吗？
     * @param area
     * @return
     */
    public abstract boolean fly(String... args);

    public void sleep(){
        System.out.println("动物基本都要睡觉觉?!");
    }
}
