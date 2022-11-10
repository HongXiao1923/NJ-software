package headFirst.designPattern.IIDecorator;

/**
 * @author Einstein
 * @version 1.0
 * @description 饮料——黑烤
 * @date 2022/11/10 15:35
 * @see
 */
public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.21;
    }
}
