package headFirst.designPattern.aStrategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 鸭子“叫”行为——不出声
 * @date 2022/11/12 21:26
 * @see
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
