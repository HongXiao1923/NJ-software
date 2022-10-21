package softwareEngineering.software.designPattern.build.factoryMethod.chicago;

import softwareEngineering.software.designPattern.build.factoryMethod.Pizza;

/**
 * @author Einstein
 * @version 1.0
 * @description 具体产品：芝加哥蛤蜊披萨
 * @date 2022/10/19 10:51
 * @see
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza(){
        name = "Chicago Style Deep Dish Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Clam");
    }

    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}
