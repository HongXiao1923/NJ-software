package headFirst.designPattern.IStrategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 鸭子“飞”行为——用翅膀飞
 * @date 2022/11/12 21:24
 * @see
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
