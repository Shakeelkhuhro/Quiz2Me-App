package Quiz2Me;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizGk extends JFrame implements ActionListener {
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

    QuizGk(String name) {
        this.name = name;
        setBounds(0, 0, 1600, 850);
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);

        // image

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imgs/Quiz.png"));
        JLabel image = new JLabel(i1);
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

        questions[0][0] = "Who was the first President of the Constituent Assembly of Pakistan? ";
        questions[0][1] = " Liaquat Ali Khan";
        questions[0][2] = " Quaid-e-Azam";
        questions[0][3] = " Moulvi Tameez-ud-Din ";
        questions[0][4] = " Sardar Abdur Rab Nishtar ";

        questions[1][0] = " After how many years Pakistan got its first constitution?";
        questions[1][1] = "5 year";
        questions[1][2] = "7 year";
        questions[1][3] = "9 years";
        questions[1][4] = "11 year";

        questions[2][0] = " When the Constituent Assembly passed the Objective Resolution ?";
        questions[2][1] = "14th February 1949";
        questions[2][2] = "12th March 1949";
        questions[2][3] = "9th June 1949";
        questions[2][4] = "15th August 1949";

        questions[3][0] = " Who was Mohammad Ali Bogra ?  ";
        questions[3][1] = " Prime Minister";
        questions[3][2] = " Foreign Minister";
        questions[3][3] = " Law Minister";
        questions[3][4] = " Parliamentary Minister ";

        questions[4][0] = " When first constitution of Pakistan was enforced ?";
        questions[4][1] = "8th June 1956";
        questions[4][2] = "23rd March 1956";
        questions[4][3] = "14th August 1956";
        questions[4][4] = "25th December 1956";

        questions[5][0] = " Who was the Prime Minister of Pakistan during enforcement of first constitution? ";
        questions[5][1] = " Mohammad Ali Bogra ";
        questions[5][2] = " Khawaja Nazim Uddin ";
        questions[5][3] = " Choudary Mohammad Ali";
        questions[5][4] = " Ibrahim Ismail Chundrigar ";

        questions[6][0] = " How many districts of Balochistan are declared as `Calamity-hit` ?";
        questions[6][1] = "30";
        questions[6][2] = "32";
        questions[6][3] = "34";
        questions[6][4] = "25";

        questions[7][0] = " What official name was given to Pakistan in 1956 constitution? ";
        questions[7][1] = " United State of Pakistan";
        questions[7][2] = " Islamic Republic of Pakistan";
        questions[7][3] = "Republic Pakistan";
        questions[7][4] = " Islamic Pakistan";

        questions[8][0] = " Who won noble peace prize of 2022?";
        questions[8][1] = " Ales Bialiatski ";
        questions[8][2] = " Memorial & Center for Civil Liberties";
        questions[8][3] = " Both A&B";
        questions[8][4] = " None of these";

        questions[9][0] = "  Who Reviewed the famous book “The Indian Musalmans” in 1872?";
        questions[9][1] = " Sir William Wilson Hunter ";
        questions[9][2] = " Sir Syed Ahmad Khan";
        questions[9][3] = " M Delwar Hussain ";
        questions[9][4] = " John King Fairbank ";

        // Find below the Answers Array of the above Questions

        answers[0] = " Quaid-e-Azam";
        answers[1] = "9 years";
        answers[2] = "12th March 1949";
        answers[3] = " Prime Minister";
        answers[4] = "23rd March 1956";
        answers[5] = " Choudary Mohammad Ali";
        answers[6] = "32";
        answers[7] = " Islamic Republic of Pakistan";
        answers[8] = " Both A&B";
        answers[9] = " Sir Syed Ahmad Khan";

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
        next.setFocusPainted(false);
        add(next);

        lifeline = new JButton("50,50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tohama", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setBackground(Color.WHITE);
        lifeline.addActionListener(this);
        lifeline.setFocusPainted(false);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tohama", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setBackground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        submit.setFocusPainted(false);
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

                  //  System.out.println("Score " + score);
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
    //     QuizGk Q1 = new QuizGk("User");
    // }
}