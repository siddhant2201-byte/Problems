
import javax.swing.*;

public class bankingsystem{
    public static void main(String[] args) {

        JFrame f = new JFrame("Banking System");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JLabel lab1 = new JLabel("Username");
        lab1.setBounds(30, 50, 100, 40);
        f.add(lab1);

        JTextField tf1 = new JTextField();
        tf1.setBounds(150, 50, 200, 40);
        f.add(tf1);

        JLabel lab2 = new JLabel("Password");
        lab2.setBounds(30, 100, 100, 40);
        f.add(lab2);

        JPasswordField pf1 = new JPasswordField();
        pf1.setBounds(150, 100, 200, 40);
        f.add(pf1);

        JButton btn1 = new JButton("Login");
        btn1.setBounds(150, 150, 100, 40);
        f.add(btn1);

        f.setVisible(true);
    }
}