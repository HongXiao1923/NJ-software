package headFirst.designPattern.IVFactory.iiiAbstractFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/18 15:01
 * @see
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NewYork Style Cheese Pizza.");
        }else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NewYork Style Veggie Pizza.");
        }else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NewYork Style Clam Pizza.");
        }else if(item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NewYork Style Pepperoni Pizza.");
        }
        return pizza;
    }
}
