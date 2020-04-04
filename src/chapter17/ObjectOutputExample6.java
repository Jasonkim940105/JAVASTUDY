package chapter17;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample6 {
    public static void main(String[] args) {

        ObjectOutputStream out = null;

        try {
             out = new ObjectOutputStream(new FileOutputStream("output6.dat"));

            BookInfo obj = new BookInfo("80801", "반지의 제왕", 20000,"톨킨",636);

            out.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}
