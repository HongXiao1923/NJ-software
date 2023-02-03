package headFirst.designPattern.dFactory.iiFactoryMethod;

/**
 * @author Einstein
 * @version 1.0
 * @description 抽象披萨店
 * @date 2022/11/14 15:55
 * @see
 */
public abstract class PizzaStore {
    public  Pizza orderPizza(String type){
        Pizza pizza = null;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 实例化的Pizza的所有责任在这里实现，该方法扮演工厂的角色
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
