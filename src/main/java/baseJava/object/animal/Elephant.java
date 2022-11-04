package baseJava.object.animal;

import baseJava.object.animal.AbstractAnimal;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/4 18:42
 * @see
 */
public class Elephant extends AbstractAnimal {
    public String name;
    public String area;

    public Elephant() {
    }

    public Elephant(String name, String area) {
        this.name = name;
        this.area = area;
    }

    @Override
    public int legs() {
        System.out.println("大象有四条腿呢！");
        return 4;
    }

    @Override
    public boolean fly(String... args) {
        System.out.println("你觉得大象可以飞吗？");
        return false;
    }

    public void sleep(){
        super.sleep();
        System.out.println("大象好像不太喜欢睡觉的样子。");
    }
}
