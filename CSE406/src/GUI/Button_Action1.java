package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    Container c;
    JButton btn;
    JButton btn2;
    JButton btn3;
    MyFrame() {
        c = this.getContentPane();
        c.setLayout(null);
        btn = new JButton("Orange");
        btn2 = new JButton("Green");
        btn3 = new JButton("Blue");
        btn.setBounds(100,200,150,50);
        btn.setFont(new Font("Arial", Font.ITALIC, 24));
        btn.setForeground(Color.orange);
        btn.setBackground(Color.DARK_GRAY);
        c.add(btn);
        btn.addActionListener(this); // this --> refers to current object i.e., button

        btn2.setBounds(300,200,150,50);
        btn2.setFont(new Font("Arial", Font.ITALIC, 24));
        btn2.setForeground(Color.GREEN);
        btn2.setBackground(Color.DARK_GRAY);
        c.add(btn2);
        btn2.addActionListener(this);

        btn3.setBounds(500,200,150,50);
        btn3.setFont(new Font("Arial", Font.ITALIC, 24));
        c.add(btn3);
        btn3.setForeground(Color.BLUE);
        btn3.setBackground(Color.DARK_GRAY);
        btn3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn)
            c.setBackground(Color.ORANGE);
        if (e.getSource() == btn2)
            c.setBackground(Color.GREEN);
        if (e.getSource() == btn3)
            c.setBackground(Color.BLUE);
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
