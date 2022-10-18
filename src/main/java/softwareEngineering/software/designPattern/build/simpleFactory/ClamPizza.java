package softwareEngineering.software.designPattern.build.simpleFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description 具体的披萨
 * @date 2022/10/18 20:24
 * @see
 */
public class ClamPizza extends Pizza{

    @Override
    public void bake() {
        System.out.println("bake ClamPizza ...");
    }

    @Override
    public void box() {
        System.out.println("box ClamPizza ...");
    }

    @Override
    public void cut() {
        System.out.println("cut ClamPizza ...");
    }

    @Override
    public void prepare() {
        System.out.println("prepare ClamPizza ...");
    }

}
