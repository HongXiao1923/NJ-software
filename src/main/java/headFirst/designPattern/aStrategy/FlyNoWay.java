package headFirst.designPattern.aStrategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 鸭子“飞”行为——不会飞
 * @date 2022/11/12 21:24
 * @see
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
