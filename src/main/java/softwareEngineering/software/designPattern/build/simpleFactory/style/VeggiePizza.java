package softwareEngineering.software.designPattern.build.simpleFactory.style;

import softwareEngineering.software.designPattern.build.simpleFactory.Pizza;

/**
 * @author Einstein
 * @version 1.0
 * @description 具体产品：素食披萨
 * @date 2022/10/18 20:24
 * @see
 */
public class VeggiePizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("bake VeggiePizza ...");
    }

    @Override
    public void box() {
        System.out.println("box VeggiePizza ...");
    }

    @Override
    public void cut() {
        System.out.println("cut VeggiePizza ...");
    }

    @Override
    public void prepare() {
        System.out.println("prepare VeggiePizza ...");
    }

}
