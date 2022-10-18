package softwareEngineering.software.designPattern.build.simpleFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description 具体的披萨
 * @date 2022/10/18 20:24
 * @see
 */
public class VeggiePizza extends Pizza{

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
