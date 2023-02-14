package thread.aThinker.iBase;

public class SeparateSubTask extends Thread{

    private int count = 0;
    private iCounter2 c2;
    private boolean runFlag = true;

    public SeparateSubTask(iCounter2 c2){
        this.c2 = c2;
        start();
    }

    public void invertFlag(){
        runFlag = !runFlag;
    }

    public void run(){
        while(true){
            try{
                sleep(100);
            }catch (InterruptedException e){
                c2.t.setText(Integer.toString(count++));
            }
        }
    }
}
