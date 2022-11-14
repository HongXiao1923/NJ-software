package headFirst.designPattern.IVFactory.iiFactoryMethod;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/14 16:00
 * @see
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYCheesePizza();
        }else if(type.equals("clam")){
            return new NYVeggiePizza();
        }else if(type.equals("veggie")){
            return new NYVeggiePizza();
        }else{
            return null;
        }
    }
}
