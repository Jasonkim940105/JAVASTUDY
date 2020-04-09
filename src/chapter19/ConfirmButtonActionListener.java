package chapter19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmButtonActionListener implements ActionListener {
    JTextField text;
    JLabel label;
    ConfirmButtonActionListener(JTextField text, JLabel label){
        this.text = text;
        this.label = label;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = text.getText();
        label.setText(name);
    }
}
