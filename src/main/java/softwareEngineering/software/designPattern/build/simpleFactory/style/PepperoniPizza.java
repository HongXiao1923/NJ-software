package softwareEngineering.software.designPattern.build.simpleFactory.style;

import softwareEngineering.software.designPattern.build.simpleFactory.Pizza;

/**
 * @author Einstein
 * @version 1.0
 * @description 具体产品：意大利腊肠披萨
 * @date 2022/10/18 20:24
 * @see
 */
public class PepperoniPizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("bake PepperoniPizza ...");
    }

    @Override
    public void box() {
        System.out.println("box PepperoniPizza ...");
    }

    @Override
    public void cut() {
        System.out.println("cut PepperoniPizza ...");
    }

    @Override
    public void prepare() {
        System.out.println("prepare PepperoniPizza ...");
    }

}
