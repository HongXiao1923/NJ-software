package thread.CyC.bMustKnow;

public class SleepThread implements Runnable{

    /* Todo sleep(mills) 方法休眠当前进程，可能会产生InterruptedException，
            而异常又不能跨线程传播回main()中，因此必须在本地处理*/
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
