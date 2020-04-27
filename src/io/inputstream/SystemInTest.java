package io.inputstream;


import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) {
        System.out.println("입력");

        try {
            int i;
            while ( (i = System.in.read()) != '0'){
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
