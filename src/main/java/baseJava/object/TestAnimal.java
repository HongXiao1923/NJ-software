package baseJava.object;

import baseJava.object.animal.AbstractAnimal;
import baseJava.object.animal.Elephant;
import baseJava.object.animal.FlyFish;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/4 18:48
 * @see
 */
public class TestAnimal {
    public static void main(String[] args) {
        AbstractAnimal animal = new Elephant();
        Elephant elephant = new Elephant();
        FlyFish flyFish = new FlyFish("飞鱼","大西洋");

        animal.fly();
        animal.sleep();
        System.out.println("---------");

        elephant.legs();
        elephant.sleep();
        System.out.println("---------");

        flyFish.legs();
        flyFish.fly();
        flyFish.sleep();
        System.out.println("---------");

    }
}
