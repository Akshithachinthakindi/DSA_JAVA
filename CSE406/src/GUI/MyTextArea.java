package GUI;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyTextArea {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(800, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JTextArea textarea = new JTextArea();
        textarea.setSize(200, 200);
        textarea.setLocation(100, 100);
        c.add(textarea);
        c.setBackground(Color.MAGENTA);
        textarea.setBackground(Color.yellow);
    }
}