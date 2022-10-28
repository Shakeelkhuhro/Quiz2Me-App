package Quiz2Me;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*; // for action on btn

public class Score extends JFrame implements ActionListener {

    JButton home,exit,rePlay;

    Score(String name, int score) {
        setBounds(0, 0, 1550, 900);
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);

        // image

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imgs/score3.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(170, 90, 1000, 400);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for playing Quiz2Me");
        heading.setBounds(450, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        if (score >= 50) {
            JLabel lblScore1 = new JLabel("Congratulations! " + name + " You have passed the test ");
            lblScore1.setBounds(450, 550, 900, 30);
            lblScore1.setFont(new Font("Tahoma", Font.PLAIN, 26));
            add(lblScore1);

        } else {
            JLabel lblScore2 = new JLabel("OOP! " + name + " You are fail, try again");
            lblScore2.setBounds(450, 550, 700, 30);
            lblScore2.setFont(new Font("Tahoma", Font.PLAIN, 26));
            add(lblScore2);
        }
        JLabel lblScore = new JLabel("Your Score is " + score);
        lblScore.setBounds(500, 600, 300, 30);
        lblScore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblScore);

        home = new JButton("Home");
        home.setBounds(500, 670, 100, 30);
        home.setFont(new Font("Tohama", Font.PLAIN, 22));
        home.setBackground(Color.WHITE);
        home.addActionListener(this); // for actions
        add(home);

        rePlay = new JButton("Replay");
        rePlay.setBounds(610, 670, 110, 30);
        rePlay.setFont(new Font("Tohama", Font.PLAIN, 22));
        rePlay.setBackground(Color.WHITE);
        rePlay.addActionListener(this);
        add(rePlay);

        exit = new JButton("Exit");
        exit.setBounds(730, 670, 100, 30);
        exit.setFont(new Font("Tohama", Font.PLAIN, 22));
        exit.setBackground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        setVisible(true); //display

    }

    public void actionPerformed(ActionEvent ae){
      
      if(ae.getSource()==home){
         // setVisible(false);
      dispose();
      new Login();
      }      else if(ae.getSource()==rePlay){
        // setVisible(false);
     dispose();
     new Login2();
     } 
      
      else if (ae.getSource()==exit){
        // setVisible(false);
        dispose();
    }
}
    

//  public static void main(String[] args) {
//     new Score("User",0);
//  }    
}
