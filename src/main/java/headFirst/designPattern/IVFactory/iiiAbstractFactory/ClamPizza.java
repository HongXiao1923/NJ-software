package headFirst.designPattern.IVFactory.iiiAbstractFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/18 14:54
 * @see
 */
public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;       //引入原料工厂

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
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
        clams = ingredientFactory.createClam();
    }
}
