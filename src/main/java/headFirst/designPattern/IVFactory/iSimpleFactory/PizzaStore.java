package headFirst.designPattern.IVFactory.iSimpleFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description Pizza店
 * @date 2022/11/14 15:32
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    /**
     * 绑定工厂（相当于传一个命令）
     * @param factory
     */
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;

        //根据“类型”来调用工厂生产具体披萨
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
