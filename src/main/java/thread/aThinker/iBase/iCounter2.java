package thread.aThinker.iBase;

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
public class iCounter2 extends Applet {

    TextField t = new TextField(10);
    private SeparateSubTask sp = null;

    private Button
        onOff = new Button("Toggle"),
        start = new Button("Start");

    public void init(){
        add(t);
        start.addActionListener(new StartL());
        add(start);
        onOff.addActionListener(new OnOffL());
        add(onOff);
    }

    class StartL implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(sp == null){
                sp = new SeparateSubTask(iCounter2.this);
            }
        }
    }

    class OnOffL implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(sp != null){
                sp.invertFlag();
            }
        }
    }

    public static void main(String[] args) {
        iCounter2 applet = new iCounter2();
        Frame frame = new Frame("iCounter2");
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
