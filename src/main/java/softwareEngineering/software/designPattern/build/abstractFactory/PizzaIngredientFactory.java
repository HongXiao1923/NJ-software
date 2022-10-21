package softwareEngineering.software.designPattern.build.abstractFactory;

import softwareEngineering.software.designPattern.build.abstractFactory.ingredient.*;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/10/19 19:34
 */
public interface PizzaIngredientFactory {
    /*
     * 在接口中，每个原料都有一个对应的方法创建该原料
     */
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
