package chapter15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample10 {
    public static void main(String[] args) {
       // FileNotFoundException 은 IOException 이 SubClass 임으로, 2번째 catch 문은 실행 가능성이 없기 때문에 컴파일 에러가 발생한다.
        try{
            FileReader reader = new FileReader("some.txt");
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        } /*catch (FileNotFoundException e){
            e.printStackTrace();
         }*/
    }
}
