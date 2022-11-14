package headFirst.designPattern.IVFactory.iiFactoryMethod;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/14 16:02
 * @see
 */
public class ChicagoCheesePizza extends Pizza{
    public ChicagoCheesePizza(){
        name = "Chicago style deep dish and cheese pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("深蓝披萨调料");
    }

    @Override
    void cut(){
        System.out.println("Cutting the pizza into Square slice.");
    }
}
