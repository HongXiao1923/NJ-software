package softwareEngineering.software.designPattern.build.abstractFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/10/19 19:38
 * @see
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Prepare " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();
    }

}
