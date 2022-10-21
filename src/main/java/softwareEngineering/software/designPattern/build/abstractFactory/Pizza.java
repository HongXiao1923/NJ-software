package softwareEngineering.software.designPattern.build.abstractFactory;

import softwareEngineering.software.designPattern.build.abstractFactory.ingredient.*;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/10/19 19:37
 * @see
 */
public abstract class Pizza {
    /*
     * 每个披萨都持有一组在准备时会用到的原料
     */
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 munites at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
