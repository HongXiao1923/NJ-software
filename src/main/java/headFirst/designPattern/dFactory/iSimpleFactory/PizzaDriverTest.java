package headFirst.designPattern.dFactory.iSimpleFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description 简单工厂测试类
 * @date 2022/11/26 16:33
 * @see
 */
public class PizzaDriverTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("veggie");

        System.out.println("------分割线------");
        System.out.println(pizza.toString());
    }
}
