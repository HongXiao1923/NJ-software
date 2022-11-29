package headFirst.designPattern.IVFactory.iiFactoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Einstein
 * @version 1.0
 * @description 披萨根类
 * @date 2022/11/14 15:22
 * @see
 */
public abstract class Pizza {
    String name;        //名称
    String dough;       //面团类型
    String sauce;       //酱汁
    List<String > toppings = new ArrayList<>();     //馅料

    /**
     * 按一定步骤准备
     */
    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough……");
        System.out.println("Adding sauce……");
        System.out.println("Adding tapping:");
        for(String topping : toppings){
            System.out.println("    " + topping);
        }
    }

    void bake(){
        System.out.println("Baking for 25 minutes at 350.");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slice.");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box.");
    }

    //getter setter

    public String getName() {
        return name;
    }
}
