package headFirst.designPattern.IIIDecorator;

/**
 * @author Einstein
 * @version 1.0
 * @description 订单测试
 * @date 2022/11/10 15:44
 * @see
 */
public class StarbucksCoffee {
    public static void main(String[] args) {
        //一杯浓咖啡（不带配料）
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        //双倍摩卡豆奶带奶泡的拿铁
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        //豆奶、摩卡、奶泡、牛奶的家庭混合型
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Milk(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
