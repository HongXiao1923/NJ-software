package headFirst.designPattern.aStrategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 抽象的鸭子根类
 * @date 2022/11/12 21:19
 * @see
 */
public abstract class Duck {
    //为接口声明两个引用变量
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * 以下 setter 用于动态设置行为
     * @return
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    /**
     * 以下两个方法均为：委托给行为类
     */
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
