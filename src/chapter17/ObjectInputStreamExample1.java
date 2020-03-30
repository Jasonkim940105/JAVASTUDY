package chapter17;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectInputStreamExample1 {
    public static void main(String[] args) {
        ObjectInputStream in = null ; // 받아올 객체를 담을 스트림 생성
        try {
            in = new ObjectInputStream(new FileInputStream("output.dat")); // 스트림은 output.dat 파일로 부터 객체를 받아옴
            while ( true ){
                GregorianCalendar calendar = (GregorianCalendar)in.readObject(); // 객체를 읽어와 역직렬화
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int date = calendar.get(Calendar.DATE);
                System.out.println(year  +  " / " + month +  " / " + date  );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException eofa){
            System.out.println("끝");
        } catch (IOException ioe){
            System.out.println("파일을 읽을 수 없습니다");
        } catch (ClassNotFoundException cnfe){
            System.out.println("클래스가 존재하지않스니다.");
        }
    }
}
