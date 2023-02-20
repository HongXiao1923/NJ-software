package thread.CyC.bMustKnow;

import thread.CyC.aStart.MyRunnable;
import thread.CyC.aStart.MyThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        final int TIMES = 6;
        int cnt = 0;
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < TIMES; i++) {
            executorService.execute(new MyRunnable());
            cnt++;
        }
        executorService.shutdown();

        System.out.println("------------");
        Thread thread = new Thread(new MyThread());
        thread.setDaemon(true);
    }
}
