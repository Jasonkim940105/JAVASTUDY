package chapter17;

import java.io.*;

public class ObjectInputExample6 {
    public static void main(String[] args) {
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("output6.dat"));
            BookInfo obj = (BookInfo)in.readObject();
            System.out.println("상품코드: "  + obj.code);
            System.out.println("상품명: " +  obj.name);
            System.out.println("가격: " + obj.price);
            System.out.println("지은이: " + obj.writer);
            System.out.println("페이지수: " + obj.page);

        } catch (FileNotFoundException fnfe) {
            System.out.println("해당 파일이 존재하지 않습니다.");
        }catch (EOFException eofe){
            System.out.println("파일을 다 읽음");
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        } catch (ClassNotFoundException fnfe){
            System.out.println("해당하는 클래스가 없습니다. ");
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
