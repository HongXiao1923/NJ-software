package headFirst.designPattern.dFactory.iiiAbstractFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/18 14:54
 * @see
 */
public class PepperoniPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;       //这地方“藏”了一个原料工厂

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * 抽象工厂的精华之处，魔法在这里！
     */
    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
