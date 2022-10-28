package Quiz2Me;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizComp extends JFrame implements ActionListener {
    String questions[][] = new String[10][5];
    String answers[] = new String[10];
    String user_answers[] = new String[10];

    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupOptions;
    JButton next, lifeline, submit;

    public int timer = 15; // for timer
    public int ans_given = 0;
    public int count = 0;
    public int score = 0;

    String name;

    QuizComp(String name) {
        this.name=name;
        setSize(1600, 850);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);

        // image

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("imgs/Quiz.png"));
        JLabel image=new JLabel(i1);
        image.setBounds(0, 0, 1600, 400);
        add(image);

        qno = new JLabel("1");
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        question = new JLabel("This is Question no1");
        question.setBounds(150, 450, 1200, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);

        questions[0][0] = "Which is the first phase of SDCL?";
        questions[0][1] = "Coading";
        questions[0][2] = "Design";
        questions[0][3] = "Analysis ";
        questions[0][4] = "Preliminary investigation";

        questions[1][0] = "NTFS stands for ?";
        questions[1][1] = "New Trend File Saving";
        questions[1][2] = "Network File Saving";
        questions[1][3] = "New Technology File System";
        questions[1][4] = "None of These";

        questions[2][0] = "In computer science and information technology (IT), DNS is an abbreviation of ?";
        questions[2][1] = "Direct Name System";
        questions[2][2] = "Domain Name System";
        questions[2][3] = "Direct Name Software";
        questions[2][4] = "Domain Name Software";

        questions[3][0] = "Which of the following is the part of Central Processing Unit (CPU) ?";
        questions[3][1] = "Printer";
        questions[3][2] = "Mouse";
        questions[3][3] = "Arithmetic & Logic unit";
        questions[3][4] = "Keyword";

        questions[4][0] = " Which device is required for the Internet Connection ? ";
        questions[4][1] = "Modren";
        questions[4][2] = "NIC Card";
        questions[4][3] = "Joystick ";
        questions[4][4] = "CD Drive";

        questions[5][0] = "MICR Stands for ?";
        questions[5][1] = "Magnetic Ink Character Reader";
        questions[5][2] = "Magnetic Ink Caser Reader";
        questions[5][3] = "Magnetic Ink Code Reader";
        questions[5][4] = "None";

        questions[6][0] = "The Capacity of 3.5 inch floppy disk was ?";
        questions[6][1] = "1.44 GB";
        questions[6][2] = "1.44MB";
        questions[6][3] = "1.40GB";
        questions[6][4] = "1.40MB";

        questions[7][0] = "CAD stands for ??";
        questions[7][1] = "Computer aided design";
        questions[7][2] = "Computer application in design ";
        questions[7][3] = "Computer analogue design ";
        questions[7][4] = "Computer algorithm for design";

        questions[8][0] = "What is light pen ? ";
        questions[8][1] = "Electronic input device";
        questions[8][2] = " Optical output device";
        questions[8][3] = "Optical input device";
        questions[8][4] = "A mechanical input device";

        questions[9][0] = "What type of resources is most likely to be a share common resource in a computer network ?";
        questions[9][1] = "Keyboards";
        questions[9][2] = "Speakers";
        questions[9][3] = "Floppy disk Drive's ";
        questions[9][4] = "Printers";

        // Find below the Answers Array of the above Questions

        answers[0] = "Preliminary investigation";
        answers[1] = "New Technology File System";
        answers[2] = "Domain Name System";
        answers[3] = "Arithmetic & Logic unit";
        answers[4] = "Modren";
        answers[5] = "Magnetic Ink Character Reader";
        answers[6] = "1.44MB";
        answers[7] = "Computer aided design";
        answers[8] = "Optical input device";
        answers[9] = "Printers";

        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);

        groupOptions = new ButtonGroup();
        groupOptions.add(opt1);
        groupOptions.add(opt2);
        groupOptions.add(opt3);
        groupOptions.add(opt4);

        // buttons
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tohama", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setBackground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50,50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tohama", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setBackground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tohama", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setBackground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        // function to start
        start(count);

        setVisible(true);

    }

    // for action on button click
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();

            opt1.setEnabled(true); // to make it again enabled
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (groupOptions.getSelection() == null) {
                user_answers[count] = "";
            } else {
                user_answers[count] = groupOptions.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);

        } 
        else if (ae.getSource() == submit) {
            ans_given=1;
            if (groupOptions.getSelection() == null) {
                user_answers[count] = "";
            } else {
                user_answers[count] = groupOptions.getSelection().getActionCommand();
            }

            // loop for calculating score
            for (int i = 0; i < 10; i++) {

               // System.out.println(user_answers[i] + "\t" + answers[i]);

                if (user_answers[i].equals(answers[i])) {
                    score += 10;

                   // System.out.println("Score " + score);
                }

               // System.out.println("Loop " + i);
            }
            // setVisible(false);
            dispose();
            new Score(Login.nameFormLogin1,score); // this will open new page for score

        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left " + timer + " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tohama", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1100, 470);
        } else {
            g.drawString("Times up!!", 1100, 470);
        }

        timer--; // 14 after one second

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            System.out.println("Any eror occured");
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true); // to make it again enabled
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 9) { // submit

            } else { // next

            }
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            if (count == 9) { // submit
                if (groupOptions.getSelection() == null) {
                    user_answers[count] = "";
                } else {
                    user_answers[count] = groupOptions.getSelection().getActionCommand();
                }

                // loop for calculating score
                for (int i = 0; i < user_answers.length; i++) {

                   // System.out.println(user_answers[i] + " \t " + answers[i]);

                    if (user_answers[i].equals(answers[i])) {
                        score += 10;
                       // System.out.println("Score = " + score);
                    }

                   // System.out.println();
                }
                //setVisible(false);
                dispose();
                new Score(Login.nameFormLogin1,score); // this will open new page for score


                // score

            } else { // next
                if (groupOptions.getSelection() == null) {
                    user_answers[count] = "";
                } else {
                    user_answers[count] = groupOptions.getSelection().getActionCommand();
                }
                count++;
                start(count); // will use to play next question
            }
        }
    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupOptions.clearSelection();
    }

    // public static void main(String[] args) {
    //     QuizComp Q1 = new QuizComp("User");
    // }
}