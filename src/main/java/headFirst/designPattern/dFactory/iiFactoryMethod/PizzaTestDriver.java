package headFirst.designPattern.dFactory.iiFactoryMethod;

/**
 * @author Einstein
 * @version 1.0
 * @description 工厂方法测试类
 * @date 2022/11/14 16:20
 * @see
 */
public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        System.out.println("------ 分割线 ------");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
