package headFirst.designPattern.aStrategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 鸭子测试类
 * @date 2022/11/12 21:40
 * @see
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("-------- 分隔线 --------");

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());       //重新给模型鸭定义“飞”的属性
        model.performFly();
    }
}
