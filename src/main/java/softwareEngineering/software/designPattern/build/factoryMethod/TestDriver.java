package softwareEngineering.software.designPattern.build.factoryMethod;

/**
 * @author Einstein
 * @version 1.0
 * @description 工厂测试：Ethan要一份纽约口味的披萨，Joel需要芝加哥口味的披萨
 * @date 2022/10/19 11:06
 * @see
 */
public class TestDriver {
    public static void main(String[] args) {
        System.out.println("---------Joel 需要的芝加哥风味的深盘披萨---------");
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();       //建立芝加哥的披萨店
        Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese");      //下订单
        System.out.println("Joel ordered a " + joelPizza.getName() + "\n");

        System.out.println("---------Ethan 需要的纽约风味的披萨---------");
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza ethanPizza = nyPizzaStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + ethanPizza.getName() + "\n");

    }
}
