package headFirst.designPattern.IStrategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 鸭子“飞”行为——使用火箭动力飞
 * @date 2022/11/12 21:47
 * @see
 */
public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!!");
    }
}
