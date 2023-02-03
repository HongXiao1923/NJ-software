package headFirst.designPattern.iAdapter;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo 设计一个用火鸡模拟鸭子的适配器
 * @date 2023/2/3 22:05
 * @see
 */
public class TurkeyAdapter implements Duck{
    Turkey turkey;
    private static final int TIMES = 5;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * 鸭子飞的距离比火鸡远，火鸡飞五次的距离和鸭子飞一次的距离相当
     */
    @Override
    public void fly() {
        for (int i = 0; i < TIMES; i++) {
            turkey.fly();
        }

    }
}
