package chapter19;

import javax.swing.*;
import java.awt.*;

public class WindowExample6 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JPanel 을 이용한 레이아웃");
        frame.setPreferredSize(new Dimension(250,150));
        frame.setLocation(500,400);

        Container contentPane = frame.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();
        JTextField text3 = new JTextField();
        panel.add(new Label("이름"));
        panel.add(text1);
        panel.add(new Label("주소"));
        panel.add(text2);
        panel.add(new Label("전화번호"));
        panel.add(text3);

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(new JButton("입력"), BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
