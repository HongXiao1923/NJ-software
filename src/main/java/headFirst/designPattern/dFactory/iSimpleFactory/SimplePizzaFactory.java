package headFirst.designPattern.dFactory.iSimpleFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description 创建具体Pizza的简单工厂
 * @date 2022/11/14 15:39
 * @see
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
