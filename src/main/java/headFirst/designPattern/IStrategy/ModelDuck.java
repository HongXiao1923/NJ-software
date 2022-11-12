package headFirst.designPattern.IStrategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 鸭子类型——模型鸭
 * @date 2022/11/12 21:44
 * @see
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();   //刚开始时模型鸭不会飞
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
