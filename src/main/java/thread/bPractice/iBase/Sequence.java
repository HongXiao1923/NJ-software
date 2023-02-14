package thread.bPractice.iBase;

import thread.annotation.GuardedBy;
import thread.annotation.NotSafeThread;
import thread.annotation.SafeThread;

public class Sequence {

    private int value;
    @GuardedBy("this")
    private int syncValue;

    /**
     * Todo 多线程是交替运行的，故此处的值并不唯一
     *      并发安全问题：存在竞态条件
     * @return
     */
    @NotSafeThread
    public int getNext(){
        return value++;
    }

    @SafeThread
    public synchronized int getSyncNext(){
        return syncValue++;
    }

}
