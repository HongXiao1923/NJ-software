package headFirst.designPattern.iAdapter;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2023/2/3 22:03
 * @see
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance!");
    }
}
