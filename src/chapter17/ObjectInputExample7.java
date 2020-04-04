package chapter17;

import java.io.*;
public class ObjectInputExample7 {
    public static void main(String[] args) {

        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("output7.dat"));
            Rectangle obj = (Rectangle)in.readObject();
            System.out.println("너비 : "  + obj.width);
            System.out.println("높이 : " + obj.height);
        } catch (FileNotFoundException fnfe) {
            System.out.println("파일이 존재하지 않습니다.");
        }  catch (EOFException eofe){
            System.out.println("파일을 다 읽어왔습니다.");
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException cnfe){
            System.out.println("해당클래스가 존재하지 않는다.");
        }
        finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
