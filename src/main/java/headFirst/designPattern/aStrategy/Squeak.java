package headFirst.designPattern.aStrategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 鸭子“叫”行为——吱吱
 * @date 2022/11/12 21:26
 * @see
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak.");
    }
}
