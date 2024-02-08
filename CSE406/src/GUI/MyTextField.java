package GUI;

import javax.swing.*;
import java.awt.*;

public class MyTextField {
    public static void main(String[] args) {
        JFrame jf = new JFrame();  // first default constructor,,, we can give frame title as well as by using setTitle as shown below
        jf.setTitle("Java Frame");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setBounds(500, 100, 800, 600);
        Container C = jf.getContentPane();
        C.setLayout(null);

        JTextField jtxt = new JTextField();
        jtxt.setBounds(200,200,300, 50);
        jtxt.setText("Enter Name: ");
        Font font = new Font("Arial", Font.BOLD, 30);
        jtxt.setFont(font);
        jtxt.setForeground(Color.orange);
        jtxt.setBackground(Color.DARK_GRAY);
        jtxt.setVisible(true);
        jtxt.setEditable(false);
        C.add(jtxt);

        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(200,300,300,50);
        C.add(pwd);
        pwd.setText("Password: ");
        pwd.setEchoChar('$');
        pwd.setFont(font);
        pwd.setForeground(Color.orange);
        pwd.setBackground(Color.DARK_GRAY);
        pwd.setEchoChar((char)0);
    }
}
