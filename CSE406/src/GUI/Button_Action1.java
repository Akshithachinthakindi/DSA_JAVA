package GUI;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
    Container c;
    JButton btn;
    MyFrame() {
        c = this.getContentPane();
        c.setLayout(null);
        btn = new JButton("Click me");
        btn.setBounds(200,200,150,50);
        btn.setFont(new Font("Arial", Font.ITALIC, 24));
        c.add(btn);
    }
}
public class Button_Action1 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Action on button");
        f.setBounds(200,100,800,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
