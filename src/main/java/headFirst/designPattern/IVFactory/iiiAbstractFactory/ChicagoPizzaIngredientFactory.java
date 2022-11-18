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
 * @date 2022/11/16 22:36
 * @see
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new Spinach(), new EggPlant()};
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
