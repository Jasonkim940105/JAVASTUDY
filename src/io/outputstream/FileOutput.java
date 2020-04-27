package io.outputstream;


import io.inputstream.FileInput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

public class FileOutput {

    public static void main(String[] args) {
        FileOutputStream fos;
        FileInputStream fis;
        try{
            fos = new FileOutputStream("output.txt");
            fos.write(65);
            fos.write(66);
            fos.write(67);
            fis = new FileInputStream("output.txt");
            int ch;
            while ( (ch = fis.read()) != -1 ){
                System.out.println((char)ch);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
