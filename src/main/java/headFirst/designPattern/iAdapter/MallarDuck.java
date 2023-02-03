package headFirst.designPattern.iAdapter;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo 一种绿头鸭
 * @date 2023/2/3 21:59
 * @see
 */
public class MallarDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack!!");
    }

    @Override
    public void fly() {
        System.out.println("I can fly a long distance!");
    }
}
