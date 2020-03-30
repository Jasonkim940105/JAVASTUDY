package chapter17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputStramExample1 {
    public static void main(String[] args) {

        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("output.dat"));
            out.writeObject(new GregorianCalendar(2006, 0, 14));
            out.writeObject(new GregorianCalendar(2006, 0, 15));
            out.writeObject(new GregorianCalendar(2006, 0,16));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                out.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
