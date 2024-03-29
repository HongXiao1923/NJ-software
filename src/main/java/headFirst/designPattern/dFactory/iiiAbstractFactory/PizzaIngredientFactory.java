package headFirst.designPattern.dFactory.iiiAbstractFactory;

import headFirst.designPattern.dFactory.iiiAbstractFactory.ingredient.dough.*;
import headFirst.designPattern.dFactory.iiiAbstractFactory.ingredient.sauce.*;
import headFirst.designPattern.dFactory.iiiAbstractFactory.ingredient.veggies.*;
import headFirst.designPattern.dFactory.iiiAbstractFactory.ingredient.cheese.*;
import headFirst.designPattern.dFactory.iiiAbstractFactory.ingredient.pepperoni.*;
import headFirst.designPattern.dFactory.iiiAbstractFactory.ingredient.clam.*;
/**
 * @author Einstein
 * @version 1.0
 * @description 原料工厂接口
 * @date 2022/11/16 21:02
 * @see
 */

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
