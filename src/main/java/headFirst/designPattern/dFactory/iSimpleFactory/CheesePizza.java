package headFirst.designPattern.dFactory.iSimpleFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/14 15:37
 * @see
 */
public class CheesePizza extends Pizza{
    public CheesePizza(){
        name = "简单工厂生产的奶酪披萨";
        dough = "加点面团";
        sauce = "加点酱汁";
    }
}
