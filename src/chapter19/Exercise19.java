package chapter19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ConfirmButton implements ActionListener{
    JTextField addVal1;
    JTextField addVal2;
    JLabel sumVal;
    int sum;

    public ConfirmButton(JTextField addVal1, JTextField addVal2, JLabel sumVal) {
        this.addVal1 = addVal1;
        this.addVal2 = addVal2;
        this.sumVal = sumVal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int val1 = Integer.parseInt(addVal1.getText());
        int val2 = Integer.parseInt(addVal2.getText());
        sum = val1 + val2;
        sumVal.setText(String.valueOf(sum));
    }
}

class CancelButton implements ActionListener{
    JTextField addVal1;
    JTextField addVal2;
    JLabel sumVal;

    public CancelButton(JTextField addVal1, JTextField addVal2, JLabel sumVal) {
        this.addVal1 = addVal1;
        this.addVal2 = addVal2;
        this.sumVal = sumVal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addVal1.setText("");
        addVal2.setText("");
        sumVal.setText("");
    }
}

public class Exercise19 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("덧셈 프로그램");
        frame.setPreferredSize(new Dimension(300,200));
        frame.setLocation(500,400);
        Container contentPane = frame.getContentPane();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,5));
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2));


        JTextField addVal1 = new JTextField();
        JTextField addVal2 = new JTextField();
        JLabel sumVal = new JLabel();
        JLabel plus = new JLabel("+");
        JLabel equal = new JLabel("=");
        JButton confirm = new JButton("확인");
        JButton cancel = new JButton("취소");


        panel.add(addVal1);
        panel.add(plus);
        panel.add(addVal2);
        panel.add(equal);
        panel.add(sumVal);
        buttonPanel.add(confirm);
        buttonPanel.add(cancel);

        ActionListener listener = new ConfirmButton(addVal1, addVal2, sumVal);
        confirm.addActionListener(listener);

        ActionListener listener1 = new CancelButton(addVal1, addVal2, sumVal);
        cancel.addActionListener(listener1);

        contentPane.add(panel,BorderLayout.CENTER);
        contentPane.add(buttonPanel,BorderLayout.SOUTH);





        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
