package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyToggleButton extends JFrame implements ActionListener
{

    Container c;

    JToggleButton btnToggle;


    MyToggleButton() {
        JFrame jf = new JFrame("My Toggle Button demo");
        jf.setBounds(200,200,800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();
        c.setLayout(null);

        btnToggle = new JToggleButton("Click me!");
        btnToggle.setBounds(200,200,250,50);
        c.add(btnToggle);
        btnToggle.setFont(new Font("Arial", Font.TRUETYPE_FONT, 24));


        btnToggle.addActionListener(this);

        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (btnToggle.isSelected()) {
            c.setBackground(Color.DARK_GRAY);
            btnToggle.setText("Click for light theme");
        }
        else {
            c.setBackground(Color.WHITE);
            btnToggle.setText("Click for dark theme");
        }
    }
}

public class ToggleButton {
    public static void main(String[] args) {
        MyToggleButton btn = new MyToggleButton();
    }
}
