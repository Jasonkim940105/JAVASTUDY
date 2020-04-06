package chapter18.practice;

import java.awt.*;

public class SleepExample1 {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i = 0 ; i < 10; i ++){
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}

        }

    }
}
