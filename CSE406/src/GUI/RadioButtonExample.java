package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonExample {

    public static void main(String[] args) {
//        JFrame frame = new JFrame("Radio Button Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setBounds(500, 100, 800, 600);
//
//        JRadioButton button1 = new JRadioButton("Option 1");
//        JRadioButton button2 = new JRadioButton("Option 2");
//        Font f = new Font("Arial", Font.ITALIC, 24);
//
//        ButtonGroup group = new ButtonGroup();
//        group.add(button1);
//        group.add(button2);
//
//        JPanel panel = new JPanel();
//        panel.add(button1);
//        panel.add(button2);
//
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Option 1 selected!");
//            }
//        });
//        button2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Option 2 selected!");
//            }
//        });
//
//        frame.add(panel);
//        frame.pack();
//        frame.setVisible(true);
        JFrame myFrame = new JFrame("Java Frame");
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setBounds(100,100,800,500);
        Container container = myFrame.getContentPane();
        container.setLayout(null);

        JRadioButton button1 = new JRadioButton("Option 1");
        JRadioButton button2 = new JRadioButton("Option 2");
        Font f = new Font("Arial", Font.ITALIC, 24);

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 1 selected!");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 2 selected!");
            }
        });
        myFrame.add(panel);



        myFrame.pack();

        myFrame.setVisible(true);
    }
}
