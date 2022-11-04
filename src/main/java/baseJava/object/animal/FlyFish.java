package baseJava.object.animal;

import baseJava.object.animal.AbstractAnimal;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/4 18:46
 * @see
 */
public class FlyFish extends AbstractAnimal {
    public String name;
    public String area;

    public FlyFish() {
    }

    public FlyFish(String name, String area) {
        this.name = name;
        this.area = area;
    }

    @Override
    public int legs() {
        System.out.println("飞鱼好像没有腿的吧？");
        return 0;
    }

    @Override
    public boolean fly(String... args) {
        System.out.println(area + "的" + name + "会飞");
        System.out.println("我猜飞鱼会飞，你猜猜呢？");
        return false;
    }

    public void sleep(){
        System.out.println("飞鱼会不会边飞边睡觉？");
    }
}
