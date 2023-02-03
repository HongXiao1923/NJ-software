package headFirst.designPattern.iAdapter;

import java.util.Random;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo 设计一个用鸭子模拟火鸡的适配器
 * @date 2023/2/3 22:10
 * @see
 */
public class DuckAdapter implements Turkey{
    public Duck duck;
    Random rand;
    private static final int TIMES = 5;

    public DuckAdapter(Duck duck, Random rand) {
        this.duck = duck;
        this.rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    /**
     * 火鸡飞的距离比鸭子近，因此鸭子平均每五次只飞一次
     */
    @Override
    public void fly() {
        if(rand.nextInt(TIMES) == 0){
            duck.fly();
        }
    }
}
