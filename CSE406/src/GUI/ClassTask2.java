package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyForm extends JFrame implements ActionListener {

    Container c;
    JLabel title;
    JLabel name;
    JTextField tname;
    JLabel mbno;
    JTextField tmbno;
    JLabel gender;
    JRadioButton male;
    JRadioButton female;
    ButtonGroup gengp;
    JLabel DOB;
    JComboBox date;
    JComboBox mon;
    JComboBox year;
    JLabel add;
    JTextArea tadd;
    JCheckBox term;
    JButton sub;
    JButton reset;
    JTextArea tout;
    JLabel res;
    JTextArea resadd;

    String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };

    String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };

    String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    MyForm() {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        mbno = new JLabel("Mobile");
        mbno.setFont(new Font("Arial", Font.PLAIN, 20));
        mbno.setSize(100, 20);
        mbno.setLocation(100, 150);
        c.add(mbno);





        setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


public class ClassTask2 {
    public static void main(String[] args) {
        MyForm form = new MyForm();
    }
}
