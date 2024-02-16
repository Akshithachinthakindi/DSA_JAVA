package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassTask {
    public static void main(String[] args) {

        JFrame jf = new JFrame("CheckBox Task");
        jf.setBounds(100, 200, 800, 600);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
//        jf.setBackground(Color.pink);
        Container c = jf.getContentPane();
        c.setLayout(null);

        Font font = new Font("Verdana", Font.TRUETYPE_FONT, 24);


//     Creating checkboxes
        Checkbox cb1 = new Checkbox("Pizza  -  100");
        Checkbox cb2 = new Checkbox("PaniPuri   -  50");
        Checkbox cb3 = new Checkbox("Noodles   - 120");
        Checkbox cb4 = new Checkbox("Samosa   -  15");
        Checkbox cb5 = new Checkbox("Tea   -  10");


//        adding checkboxes to the frame and modifying them
        c.add(cb1);
        cb1.setBounds(100, 100, 250, 50);
        cb1.setFont(font);

        c.add(cb2);
        cb2.setBounds(100, 150, 250, 50);
        cb2.setFont(font);

        c.add(cb3);
        cb3.setBounds(100, 200, 250, 50);
        cb3.setFont(font);

        c.add(cb4);
        cb4.setBounds(100, 250, 250, 50);
        cb4.setFont(font);

        c.add(cb5);
        cb5.setBounds(100, 300, 250, 50);
        cb5.setFont(font);


//        creating button
        JButton btn = new JButton("Place Order");
        btn.setBounds(150, 400, 200, 50);
        btn.setBackground(Color.DARK_GRAY);
        btn.setFont(font);
        btn.setForeground(Color.orange);
        c.add(btn);


//        creating labels
        JLabel lb = new JLabel("Select Item from Menu: ");
        lb.setBounds(100, 40, 500, 50);
        lb.setFont(font);
        lb.setForeground(Color.orange);
        c.add(lb);

        JLabel lb2 = new JLabel("Total Amount: ");
        lb2.setBounds(400, 400, 500, 50);
        lb2.setFont(font);
        lb2.setForeground(Color.orange);
        c.add(lb2);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int amount = 0;

//                if (cb1.isSelected())
//                    amount = amount+100;
//                if (cb2.isSelected())
//                    amount = amount+50;
//                if (cb3.isSelected())
//                    amount = amount+120;
//                if (cb4.isSelected())
//                    amount = amount+15;
//                if (cb5.isSelected())
                    amount = amount+10;
                lb2.setText("Total Amount: "+ amount);
            }
        });

        jf.setVisible(true);
    }
}
