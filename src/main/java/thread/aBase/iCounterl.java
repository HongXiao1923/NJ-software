package thread.aBase;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo 多线程一个最主要的用途就是构建一个“反应灵敏”的用户界面
 *                   下面简单演示一个计算器显示结果
 * @date 2023/2/13 0:40
 * @see
 */
public class iCounterl extends Applet {
    private int count = 0;
    private Button
        onOff = new Button("Toggle"),
        start = new Button("start");
    private TextField t = new TextField(10);
    private boolean runFlag = true;

    public void init(){
        add(t);
        start.addActionListener(new StartL());
        add(start);
        onOff.addActionListener(new OnOffL());
        add(onOff);
    }

    /**
     * Todo 此处函数被设计为死循环的单线程，也没有返回值，意味着即使线程进入sleep()之后，CPU依然被占用
     *      所以应该思考一种多线程的方式来改造go()？以便CPU发挥更大功效。
     */
    public void go(){
        while(true){
            try{
                Thread.currentThread().sleep(100);
            }catch (InterruptedException e){
                //
            }
            if(runFlag){
                t.setText(Integer.toString(count++));
            }
        }
    }

    class StartL implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            go();
        }
    }

    class OnOffL implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            runFlag = !runFlag;
        }
    }

    public static void main(String[] args) {
        iCounterl applet = new iCounterl();
        Frame frame = new Frame("iCounterl");
        frame.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        //super.windowClosing(e);
                        System.exit(0);
                    }
                }
        );
        frame.add(applet, BorderLayout.CENTER);
        frame.setSize(300, 200);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
}
