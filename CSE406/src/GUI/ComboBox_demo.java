package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox_demo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Combo box Demo");
        jf.setSize(700, 900);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        Container c = jf.getContentPane();
        jf.setLayout(null);

        String[] arrS = {"pepsi", "Coca", "Mirinda", "7Up", "Sprite"};
//        above is the first way to add items to the combo list
        JComboBox jcb = new JComboBox(arrS);

        jcb.setBounds(100, 100, 200, 50);
        c.add(jcb);
        jcb.setFont(new Font("Verdana", Font.TRUETYPE_FONT, 24));

        //    below is the second way to add items to the combo list
        jcb.addItem("Milk");
        jcb.addItem("Coconut");

//        to remove items from the list
        jcb.removeItem("Milk");  // it is case-sensitive, so check the spelling

//        jcb.setEditable(true);

//        default selection by name
        jcb.setSelectedItem("Coconut");

//        default selection by Index
        jcb.setSelectedIndex(5);

        JButton btn = new JButton("Selected Item");
        btn.setBounds(400,100,250,50);
        btn.setFont(new Font("Verdana", Font.TRUETYPE_FONT, 24));
        c.add(btn);

        JLabel lb = new JLabel();
        lb.setBounds(400,150,300,50);
        lb.setFont(new Font("Verdana", Font.TRUETYPE_FONT, 24));
        lb.setForeground(Color.orange);
        c.add(lb);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jcb.getSelectedItem().toString();
                lb.setText(s);
//                int s = jcb.getSelectedIndex();
//                lb.setText(String.valueOf(s));
            }
        });

        jf.setVisible(true);
    }
}
