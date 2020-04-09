package chapter19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class WindowExample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Java Program"); // 프레임 생성
        frame.setLocation(500,400); // 프레임 생성위치 설정
        frame.setPreferredSize(new Dimension(300,200)); // 프레임 크기 설정
        Container contentPane = frame.getContentPane(); // 프레임이 가지고 있는 컨텐트페인 컨테이너 쓰기 쉽게 변수에 담음
        JLabel label = new JLabel("Hello, JAVA!!" , SwingConstants.CENTER); // 라벨 생성 및 초기화
        JTextField textField = new JTextField(); // 텍스트필드 생성
        JButton button = new JButton("확인"); // 버튼 생성및 초기화

        String str = textField.getText(); // 텍스트필드에 입력한 값 가져와 str변수에 담음 but 언제 담을지는 안정했음
        label.setText(str); // label에 str변수에 담겨있는 값 뿌림 but 언제 뿌릴지는 안정했음

        contentPane.add(textField, BorderLayout.CENTER); //컨텐트페인 위에 텍스트필드 컴포넌트 add
        contentPane.add(button, BorderLayout.EAST);//컨텐트페인 위에 버튼 컴포넌트 add
        contentPane.add(label, BorderLayout.SOUTH);//컨텐트페인 위에 라벨 컴포넌트 add

        ActionListener listener = new ConfirmButtonActionListener(textField, label);
        button.addActionListener(listener);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
