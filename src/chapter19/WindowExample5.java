package chapter19;

import javax.swing.*;
import java.awt.*;

public class WindowExample5 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("box layout example");
        frame.setLocation(500,400);
        Container contentPane = frame.getContentPane();

        BoxLayout layout = new BoxLayout(contentPane, BoxLayout.X_AXIS);

        contentPane.setLayout(layout);

        contentPane.add(new JButton("자바"));
        contentPane.add(new JButton("에스프레소"));
        contentPane.add(new JButton("카푸치노"));
        contentPane.add(new JButton("블루마운틴"));
        contentPane.add(new JButton("콜럼비아"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
