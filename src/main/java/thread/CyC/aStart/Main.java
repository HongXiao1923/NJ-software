package thread.CyC.aStart;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        MyRunnable instance = new MyRunnable();
        Thread thread1 = new Thread(instance);
        //Thread thread2 = new Thread(instance);
        thread1.start();
        //thread2.start();

        System.out.println("------------");
        MyCallable mc = new MyCallable();
        FutureTask ft = new FutureTask(mc);
        Thread thread3 = new Thread(ft);
        thread3.start();
        try{
            System.out.println(ft.get());
        }catch (ExecutionException | InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("------------");
        MyThread mt = new MyThread();
        mt.start();
    }
}
