package io.inputstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
             reader = new FileReader("fileread.txt");
            int ch;
            while ((ch = reader.read())!= -1){
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
