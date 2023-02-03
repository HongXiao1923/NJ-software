package headFirst.designPattern.dFactory.iSimpleFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/14 15:37
 * @see
 */
public class VeggiePizza extends Pizza{
    public VeggiePizza(){
        name = "简单工厂生产的素食披萨";
        dough = "加点面团";
        sauce = "加点酱汁";
    }
}
