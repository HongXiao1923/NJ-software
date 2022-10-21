package softwareEngineering.software.designPattern.build.factoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Einstein
 * @version 1.0
 * @description 抽象产品：披萨
 * @date 2022/10/19 10:35
 * @see
 */
public abstract class Pizza {
    protected String name;        //名称
    protected String dough;       //面团
    protected String sauce;       //酱料
    protected List<String> toppings = new ArrayList<String>();       //佐料


    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough");
        System.out.println("Adding sause");
        System.out.println("Adding toppings");
        for(int i = 0; i < toppings.size(); i++){
            System.out.println("   "+toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
