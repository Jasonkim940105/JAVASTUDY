package chapter17;

import java.io.*;

public class ObjectInputStreamExample2 {
    public static void main(String[] args) {
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("output2.dat"));
            while(true){
                GoodStock obj = (GoodStock)in.readObject();
                System.out.println("상품코드 : "  +obj.code + "\t상품수량: " + obj.num); // \t 는 이스캐이프로 두번 space
            }

        }  catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (EOFException e){
            System.out.println("파일 다 읽어옴");
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            System.out.println("해당 클래스가 존재하지 않습니다.");
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
