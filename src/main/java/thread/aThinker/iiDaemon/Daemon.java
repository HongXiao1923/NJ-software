package thread.aThinker.iiDaemon;

public class Daemon extends Thread{

    private static final int SIZE = 10;
    private Thread[] t_arr = new Thread[SIZE];

    public Daemon(){
        setDaemon(true);
        start();
    }

    public void run(){
        for (int i = 0; i < SIZE; i++) {
            t_arr[i] = new DaemonSpawn(i);
        }
        for (int i = 0; i < SIZE; i++) {
            System.out.println(
                    "t_arr[" + i + "].isDaemon() = " + t_arr[i].isDaemon()
            );
        }
        while(true){
            yield();
        }
    }
}
