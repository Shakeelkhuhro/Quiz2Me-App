// package QuizApp;
package Quiz2Me;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login2 extends JFrame implements ActionListener {

    JButton Comp,Gk,Maths,Exit;

    Login2() {
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imgs/CompQuiz.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 300);
        add(image);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("imgs/GkQuiz.png"));
        JLabel image2 = new JLabel(i2);
        image2.setBounds(0, 210, 600, 280);
        add(image2);

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("imgs/MathQuiz.jpg"));
        JLabel image3 = new JLabel(i3);
        image3.setBounds(10, 500, 600, 270);
        add(image3);


        // image.setVisible(true);  // we can also run without this

        JLabel heading=new JLabel("Quiz2Me");
        heading.setBounds(790, 300, 300, 45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD,48));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel name=new JLabel("Select any of the Following to attempt Quiz");
        name.setBounds(700, 400, 500, 30);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,22));
        name.setForeground(Color.BLACK);
        add(name);

        // tfName=new JTextField();
        // tfName.setBounds(735,400,300,25);
        // tfName.setFont(new Font("Times New Roaman",Font.BOLD,20));
        // add(tfName);

        // ### Buttons ###
        Comp=new JButton("Computer");
        Comp.setBounds(735, 470, 100, 25);
        // Comp.setBackground(new Color(GRAY));
        Comp.setBackground(Color.WHITE);        
        Comp.setForeground(Color.BLACK);
        Comp.addActionListener(e -> {
            
           // setVisible(false);
           dispose();
            new QuizComp(Login.nameFormLogin1); 
        });
        add(Comp);

        Maths=new JButton("Mathematics");
        Maths.setBounds(850, 470, 110, 25);
        Maths.setBackground(Color.WHITE);        
        Maths.setForeground(Color.BLACK);
        Maths.addActionListener(this);
        add(Maths);

        Gk=new JButton("G.Knowledge");
        Gk.setBounds(970, 470, 120, 25);
        Gk.setBackground(Color.WHITE);        
        Gk.setForeground(Color.BLACK);
        Gk.addActionListener(this);
        add(Gk);

        Exit=new JButton("Exit");
        Exit.setBounds(850, 500, 110, 25);
        Exit.setBackground(Color.WHITE);        
        Exit.setForeground(Color.BLACK);
        Exit.addActionListener(this);
        add(Exit);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(1600, 850);
        setLocation(0, 0);
        setVisible(true);
        
    }
    // to override abstract methods 
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Comp){
            String name= Login.nameFormLogin1;
           // setVisible(false);
           dispose();
            new QuizComp(name);  // this will open rules window
        }
        else if(ae.getSource()==Maths){
            String name= Login.nameFormLogin1;
           // setVisible(false);
           dispose();
            new QuizMath(name);  // this will open rules window
        }
        else if(ae.getSource()==Gk){
            String name= Login.nameFormLogin1;
            // setVisible(false);
            dispose();
            new QuizGk(name);  // this will open rules window
        }
         else if(ae.getSource()==Exit){
           // setVisible(false);
           dispose();
        } 
    }

    // public static void main(String[] args) {
    //     Login2 l2 = new Login2();

    // }
}
