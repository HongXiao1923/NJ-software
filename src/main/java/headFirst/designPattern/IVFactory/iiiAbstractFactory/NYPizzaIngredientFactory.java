package headFirst.designPattern.IVFactory.iiiAbstractFactory;

import headFirst.designPattern.IVFactory.iiiAbstractFactory.ingredient.dough.*;
import headFirst.designPattern.IVFactory.iiiAbstractFactory.ingredient.sauce.*;
import headFirst.designPattern.IVFactory.iiiAbstractFactory.ingredient.veggies.*;
import headFirst.designPattern.IVFactory.iiiAbstractFactory.ingredient.cheese.*;
import headFirst.designPattern.IVFactory.iiiAbstractFactory.ingredient.pepperoni.*;
import headFirst.designPattern.IVFactory.iiiAbstractFactory.ingredient.clam.*;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/16 21:06
 * @see
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {

        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}