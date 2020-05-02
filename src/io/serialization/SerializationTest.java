package io.serialization;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) {

        Person p1 = new Person("a", 1);
        Person p2 = new Person("b", 2);

        try {
            FileOutputStream fos = new FileOutputStream("serial.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.writeObject(p2);

            FileInputStream fis = new FileInputStream("serial.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person pp = (Person)ois.readObject();
            Person pp2 = (Person)ois.readObject();
            System.out.println(pp.toString());
            System.out.println(pp2.toString());



        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }
    }
}
