package GUI;

import javax.swing.*;
import java.awt.*;

public class JFrame_Demo {
    public static void main(String[] args) {
        JFrame jf = new JFrame();  // first default constructor,,, we can give frame title as well as by using setTitle as shown below
        jf.setTitle("Java Frame");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
//        jf.setSize(800, 600);
//        jf.setLocation(500, 100);
        jf.setBounds(500, 100, 800, 600);
        ImageIcon icon = new ImageIcon("C:\\apple.jpeg");
        jf.setIconImage(icon.getImage());
        Container C = jf.getContentPane();
        C.setBackground(Color.orange);
        jf.setResizable(false);
    }
}
