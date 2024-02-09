package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_Action2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Button Action2");
        jf.setBounds(400,200,800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        jf.setLayout(null);

        JButton btn = new JButton("Submit");
        btn.setBounds(300,250,200,50);
        c.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.ORANGE);
            }
        });
        jf.setVisible(true);
    }
}
