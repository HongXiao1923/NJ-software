package softwareEngineering.software.designPattern.build.abstractFactory;

import softwareEngineering.software.designPattern.build.abstractFactory.ingredient.*;
import softwareEngineering.software.designPattern.build.abstractFactory.ingredient.impl.*;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/10/19 19:36
 * @see
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] =  {new Garlic(),new Onion(),new Mushroom(),new RefPepper()};
        return veggies;
    }

}
