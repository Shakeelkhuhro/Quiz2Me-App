
package Quiz2Me;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class Rules extends JFrame implements ActionListener {

    String name="Dear User";
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);


        // image for rules
        ImageIcon ruleImage = new ImageIcon(ClassLoader.getSystemResource("imgs/rules.jpg"));
        JLabel image = new JLabel(ruleImage);
        image.setBounds(700, 420, 800, 350);
        add(image);
        image.setVisible(true);

        // Label for heading of rules page
        JLabel heading = new JLabel("Welcome " + name + " at Quiz2Me");
        heading.setBounds(400, 100, 700, 25);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 28));
        heading.setForeground(Color.BLACK);
        add(heading);

        // setting labels for Rules

        JLabel rule = new JLabel("Rules");
        rule.setBounds(300, 40, 900, 350);
        rule.setFont(new Font("Tohma", Font.PLAIN, 18));
        rule.setForeground(Color.BLACK);
        rule.setText(" Rules");
        add(rule);
    
        JLabel rule1 = new JLabel("Rules");
        rule1.setBounds(300, 70, 900, 350);
        rule1.setFont(new Font("Tohma", Font.PLAIN, 18));
        rule1.setForeground(Color.BLACK);
        rule1.setText( "1. Quiz is Divided into three Sections, you can attempt each Individually.");
        add(rule1);

        // label for rule 2
        JLabel rule2 = new JLabel("Rules");
        rule2.setBounds(300, 100, 900, 350);
        rule2.setFont(new Font("Tohma", Font.PLAIN, 18));
        rule2.setForeground(Color.BLACK);
        rule2.setText("2. You have three portion for Quiz.");
        add(rule2);

        
        JLabel rule3 = new JLabel("Rules");
        rule3.setBounds(300, 140, 900, 350);
        rule3.setFont(new Font("Tohma", Font.PLAIN, 18));
        rule3.setForeground(Color.BLACK);
        rule3.setText("3. Every Portion has 10 Questions.");
        add(rule3);

        

        JLabel rule4 = new JLabel("Rules");
        rule4.setBounds(300, 170, 900, 350);
        rule4.setFont(new Font("Tohma", Font.PLAIN, 18));
        rule4.setForeground(Color.BLACK);
        rule4.setText("4. You have to attempt every Quiz individually.");
        add(rule4);

        JLabel rule5 = new JLabel("Rules");
        rule5.setBounds(300, 200, 900, 350);
        rule5.setFont(new Font("Tohma", Font.PLAIN, 18));
        rule5.setForeground(Color.BLACK);
        rule5.setText("5. Every Quiz has Equals points.");
        add(rule5);

        JLabel rule6 = new JLabel("Rules");
        rule6.setBounds(300, 230, 900, 350);
        rule6.setFont(new Font("Tohma", Font.PLAIN, 18));
        rule6.setForeground(Color.BLACK);
        rule6.setText("6. You have to correct 50% of the Questions to pass the test. ");
        add(rule6);

        JLabel rule7 = new JLabel("Rules");
        rule7.setBounds(300, 260, 900, 350);
        rule7.setFont(new Font("Tohma", Font.PLAIN, 18));
        rule7.setForeground(Color.BLACK);
        rule7.setText("7. Thanks for Chosing Quiz2Me.");
        add(rule7);

        // Buttons
        back = new JButton("Back");
        back.setBounds(500, 600, 80, 25);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(600, 600, 80, 25);
        start.setBackground(Color.WHITE);
        start.setForeground(Color.BLACK);
        start.addActionListener(this);
        add(start);

        setSize(1600, 850);
        setLocation(0, 0);
        setVisible(true);

        
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            // setVisible(false);
            dispose();
            new Login2(); // this will open new window for login2
        } else {
            //setVisible(false);
            dispose();
            new Login(); // this will open new window for back to homepage
        }
    }

    // public static void main(String[] args) {
    //     new Rules("Dear User");
    //     Login2 l2 = new Login2();
        
    //  }
}