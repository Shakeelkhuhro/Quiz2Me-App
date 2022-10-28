package Quiz2Me;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton Start, Exit;
    JTextField tfName;

    static String nameFormLogin1 = ""; // name enter by user
    // constructor

    Login() {
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imgs/profile.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 900, 800);
        add(image);
        // image.setVisible(true); // we can also run without this

        JLabel heading = new JLabel("Quiz2Me");
        heading.setBounds(790, 300, 300, 45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 48));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810, 350, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
        name.setForeground(Color.BLACK);
        add(name);

        tfName = new JTextField();
        tfName.setBounds(735, 400, 300, 25);
        tfName.setFont(new Font("Times New Roaman", Font.BOLD, 20));
        nameFormLogin1 = tfName.getName();
        add(tfName);

        // ### Buttons ###
        Start = new JButton("Start");
        Start.setBounds(735, 470, 80, 25);
        // Start.setBackground(new Color(GRAY));
        Start.setBackground(Color.WHITE);
        Start.setForeground(Color.BLACK);
        Start.addActionListener(this);
        add(Start);

        Exit = new JButton("Exit");
        Exit.setBounds(850, 470, 80, 25);
        Exit.setBackground(Color.WHITE);
        Exit.setForeground(Color.BLACK);
        Exit.addActionListener(this);
        add(Exit);

        setSize(1600, 850);
        setLocation(0, 0);
        setVisible(true);
    }

    // to override abstract methods
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Start) {
            nameFormLogin1 = tfName.getText();
            String name = tfName.getText();
            // setVisible(false);
            dispose();
            new Rules(name); // this will open rules window
        } else if (ae.getSource() == Exit) {
            // setVisible(false);
            dispose();
        }
    }

    // main class if needed
}
