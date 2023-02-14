package thread.bPractice.iBase;

import thread.annotation.NotSafeThread;

@NotSafeThread
public class LazyInitRace {

    private Object instance = null;

    /**
     * Todo 延迟初始化中存在竞态条件，不安全
     * @return
     */
    public Object getInstance(){
        if(instance == null){
            instance = new Object();
        }
        return instance;
    }
}
