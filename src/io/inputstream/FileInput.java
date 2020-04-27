package io.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/Users/jhkim/Documents/java_study/src/input.txt");
            int i;
            byte [] bs = new byte[10];
            while ( (i = fis.read(bs)) != -1 ){
                for(int k = 0 ; k < i; k ++){
                    System.out.print((char)bs[k]);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }   finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
