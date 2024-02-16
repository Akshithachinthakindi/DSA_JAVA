package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Calculator extends JFrame implements ActionListener
{
    Container c;
    JLabel label1,label2,labelresult;
    JTextField txt1, txt2;
    JButton add,sub,mul,div;
    Calculator()
    {
        setTitle("My Calculator");
        setBounds(100,100,800,600);
        Font f=new Font("Arial",Font.BOLD,34);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        c=getContentPane();
        c.setLayout(null);
// set Label
        label1 =new JLabel("First Number : ");
        label1.setBounds(50,50,100,50);
        c.add(label1);


        label2 =new JLabel("Second Number : ");
        label2.setBounds(50,150,100,50);
        c.add(label2);


        labelresult =new JLabel("Result : ");
        labelresult.setBounds(50,350,700,50);
        c.add(labelresult);
        labelresult.setFont(f);
        labelresult.setForeground(Color.RED);



        txt1=new JTextField(0);
        txt1.setBounds(250,50,150,50);
        c.add(txt1);
        txt1.setFont(f);

        txt2=new JTextField(0);
        txt2.setBounds(250,150,150,50);
        c.add(txt2);
        txt2.setFont(f);

        add=new JButton("+");
        add.setBounds(50, 250,100,50);
        c.add(add);
        add.setFont(f);
        add.addActionListener(this);



        sub=new JButton("-");
        sub.setBounds(200, 250,100,50);
        c.add(sub);
        sub.setFont(f);
        sub.addActionListener(this);

        mul=new JButton("*");
        mul.setBounds(350, 250,100,50);
        c.add(mul);
        mul.setFont(f);
        mul.addActionListener(this);

        div=new JButton("/");
        div.setBounds(500, 250,100,50);
        c.add(div);
        div.setFont(f);
        div.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {

        int x=Integer.parseInt(txt1.getText());
        int y=Integer.parseInt(txt1.getText());
        int z=0;
        if(e.getSource()==add) {
            z=x+y;
            labelresult.setText("Result : "+z);
        }
        if(e.getSource()==sub) {
            z=x-y;
            labelresult.setText("Result : "+z);
        }
        if(e.getSource()==mul) {
            z=x*y;
            labelresult.setText("Result : "+z);
        }
        if(e.getSource()==div) {
            z=x/y;
            labelresult.setText("Result : "+z);
        }
        //labelresult.setText("Result : "+z);


    }

}


public class MyCalculator {

    public static void main(String[] args) {
        Calculator c=new Calculator();
    }
}