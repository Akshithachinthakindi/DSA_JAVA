package GUI;

import javax.swing.*;
import java.awt.*;

public class MyLabel {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Java Frame");  // first default constructor,,, we can give frame title as well as by using setTitle as shown below
//        jf.setTitle("Java Frame");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500, 100, 800, 600);
        Container C = jf.getContentPane();
        C.setLayout(null);
        ImageIcon icon = new ImageIcon("C:\\apple.jpeg");
        JLabel jlabel = new JLabel("Label title: ", icon, JLabel.RIGHT);
        jlabel.setBounds(100,200,icon.getIconWidth(),icon.getIconHeight());
        C.add(jlabel);
        Font font = new Font("calibri", Font.ITALIC, 24);
        jlabel.setFont(font);
        jf.setIconImage(icon.getImage());
//        jlabel.setIcon(icon);
    }
}
