package thread.CyC.aStart;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    @Override
    public Integer call() throws Exception {
        return 123;
    }
}
