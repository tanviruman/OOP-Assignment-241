import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Class{
    int r1;
    int r2;
    int flag;
    JFrame frame;
    JTextField tf1, tf2, tf3;
    JButton one, two, three, four, plus,minus,equal;
    String s1= "";
    Class() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);


        one = new JButton(" 1 ");
        one.setBounds(130, 110, 50, 50);
        frame.add(one);

        two = new JButton(" 2 ");
        two.setBounds(280, 110, 50, 50);
        frame.add(two);

        three = new JButton(" 3 ");
        three.setBounds(130, 170, 50, 50);
        frame.add(three);

        four = new JButton(" 4 ");
        four.setBounds(280, 170, 50, 50);
        frame.add(four);

        plus = new JButton(" + ");
        plus.setBounds(100, 230, 100, 50);
        frame.add(plus);

        minus = new JButton(" - ");
        minus.setBounds(250, 230, 100, 50);
        frame.add(minus);

        equal = new JButton(" = ");
        equal.setBounds(170, 290, 100, 50);
        frame.add(equal);

        tf1 = new JTextField();
        tf1.setBounds(130, 50, 200, 50);
        frame.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(130, 350, 200, 50);
        frame.add(tf2);

        tf3 = new JTextField();
        tf3.setBounds(130, 410, 200, 50);
        frame.add(tf3);

        frame.setLayout(null);
        frame.setVisible(true);

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                tf1.setText(tf1.getText() + "1");
                tf3.setText(tf3.getText() + "1");

            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "2");
                tf3.setText(tf3.getText() + "2");

            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "3");
                tf3.setText(tf3.getText() + "3");

            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "4");
                tf3.setText(tf3.getText() + "4");

            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                r1 = Integer.parseInt(tf1.getText());
                tf3.setText("");
                tf2.setText( r1 + "");
                tf1.setText(tf1.getText() + "+");
                flag = 1;
                s1 =tf1.getText() + "" + tf2.getText();
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                r2 = Integer.parseInt(tf1.getText());
                tf3.setText("");
                tf2.setText(r2 + "");
                tf1.setText(tf1.getText() + "-");
                flag = -1;

            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (flag == 1) {

                    int result = r1 +Integer.parseInt(tf3.getText());
                    tf2.setText(s1 + "is equal to" + result);
                    tf1.setText(result + "");

                } else if (flag == -1) {

                    int result = r2 - Integer.parseInt(tf3.getText());
                    tf2.setText("is equal to" + result);
                    tf1.setText(result + "");

                }
            }
        });
    }

    public static void main(String[] args) {
        Class ca = new Class();
    }
}