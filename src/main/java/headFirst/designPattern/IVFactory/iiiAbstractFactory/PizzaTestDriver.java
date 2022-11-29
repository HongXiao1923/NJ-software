package headFirst.designPattern.IVFactory.iiiAbstractFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/18 15:14
 * @see
 */
public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = null;

        pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        System.out.println("------ 分割线 ------");

        pizza = chicagoPizzaStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName());

    }
}
