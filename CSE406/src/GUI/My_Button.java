package GUI;

import javax.swing.*;
import java.awt.*;

public class My_Button {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Java Frame");
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setBounds(100,100,800,500);
        Container container = myFrame.getContentPane();
        container.setLayout(null);

        ImageIcon icon = new ImageIcon("D:\\PlacementPrep\\25497-9-submit-button-photos.png");

        JButton button = new JButton(icon);
        button.setSize(icon.getIconWidth(), icon.getIconHeight());
//        button.setSize(200, 100);
        button.setLocation(100, 100);
        container.add(button);

        button.setFont(new Font("Arial", Font.BOLD, 24));
//        button.setText("My Button");
        button.setForeground(Color.orange);
        button.setBackground(Color.DARK_GRAY);

//        Creating a Cursor

        Cursor csr = new Cursor(Cursor.HAND_CURSOR);
        button.setCursor(csr);
        button.setEnabled(true);





        myFrame.setVisible(true);

    }
}
