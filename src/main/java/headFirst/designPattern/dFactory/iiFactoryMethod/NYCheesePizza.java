package headFirst.designPattern.dFactory.iiFactoryMethod;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/14 16:02
 * @see
 */
public class NYCheesePizza extends Pizza{
    public NYCheesePizza(){
        name = "NY style sauce and cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("芝士披萨调料");
    }
}
