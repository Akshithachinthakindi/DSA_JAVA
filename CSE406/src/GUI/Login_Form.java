package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Form {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Login Form");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500,100,800,600);
        Container c = jf.getContentPane();
        c.setLayout(null);
        ImageIcon icon = new ImageIcon("C:\\apple.jpeg");
        jf.setIconImage(icon.getImage());

//        JLabel label = new JLabel("Name: ");
//        label.setBounds(100,100, 200,50);
//        c.add(label);
        Font font = new Font("calibri", Font.ITALIC, 20);
//        label.setFont(font);

        JTextField jtxt = new JTextField();
        jtxt.setBounds(100,100,200, 50);
        jtxt.setText("Enter Name: ");
        jtxt.setFont(font);
        jtxt.setVisible(true);
        jtxt.setEditable(true);
        c.add(jtxt);

        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(100,150,200,50);
        c.add(pwd);
        pwd.setText("Password: ");
        pwd.setEchoChar('$');
        pwd.setFont(font);
        pwd.setEchoChar((char)0);

        JButton btn = new JButton("Submit");
        btn.setBounds(200,220,200,50);
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
