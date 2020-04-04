package chapter17;

import java.io.*;
public class ObjectOutputExample7 {
    public static void main(String[] args) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("output7.dat"));
            Rectangle obj = new Rectangle(100,200);
            out.writeObject(obj);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
