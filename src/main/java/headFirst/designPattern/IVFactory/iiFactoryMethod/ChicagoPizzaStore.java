package headFirst.designPattern.IVFactory.iiFactoryMethod;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/14 16:00
 * @see
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoCheesePizza();
        }else if(type.equals("clam")){
            return new ChicagoVeggiePizza();
        }else if(type.equals("veggie")){
            return new ChicagoVeggiePizza();
        }else{
            return null;
        }
    }
}
