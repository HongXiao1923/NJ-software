package thread.CyC.aStart;

public class MyRunnable implements Runnable{

    private static final int TIMES = 6;

    @Override
    public void run() {
        for (int i = 0; i < TIMES; i++) {
            System.out.println("MyRunnable: " + i);
        }
    }
}
