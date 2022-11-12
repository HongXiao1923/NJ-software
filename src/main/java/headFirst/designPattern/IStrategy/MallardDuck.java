package headFirst.designPattern.IStrategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 鸭子类型——绿头鸭
 * @date 2022/11/12 21:32
 * @see
 */
public class MallardDuck extends Duck {
    /**
     * 使用委托方式，将抽象行为委托给具体行为类
     */
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display(){
        System.out.println("I'm a real Mallard duck!");
    }
}
