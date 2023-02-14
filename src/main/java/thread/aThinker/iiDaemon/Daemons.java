package thread.aThinker.iiDaemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Daemons {

    public static void main(String[] args) {
        Thread t = new Daemon();
        System.out.println(
                "t.isDaemon() = " + t.isDaemon()
        );
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Waiting for CR");
        try{
            in.readLine();
        }catch (IOException e){
            //
        }
    }
}
