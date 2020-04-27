package io.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try {
            fis = new FileInputStream("output.txt");
            isr = new InputStreamReader(fis);
            int i;
            while ((i = isr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                isr.close(); //보조 스트림을 close 하면 원래 스트림까지 close 해줌
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
