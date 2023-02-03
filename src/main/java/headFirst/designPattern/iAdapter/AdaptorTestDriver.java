package headFirst.designPattern.iAdapter;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2023/2/3 22:17
 * @see
 */
public class AdaptorTestDriver {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdaptor = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says ……");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says ……");
        duck.quack();
        duck.fly();

        System.out.println("\nThe TurkeyAdapter says ……");
        turkeyAdaptor.quack();
        turkeyAdaptor.fly();
    }
}
