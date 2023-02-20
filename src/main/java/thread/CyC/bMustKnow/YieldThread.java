package thread.CyC.bMustKnow;

public class YieldThread implements Runnable{

    /* Todo Thread.yield()的调用声明了当前线程已经完成了生命周期中最重要的部分，可以切换给其他线程来执行*/
    @Override
    public void run() {
        Thread.yield();
    }
}
