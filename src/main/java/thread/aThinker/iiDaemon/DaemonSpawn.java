package thread.aThinker.iiDaemon;

public class DaemonSpawn extends Thread{

    public DaemonSpawn(int i){
        System.out.println(
                "Daemon " + i + " started!"
        );
        start();
    }

    public void run(){
        while(true){
            yield();
        }
    }

}
