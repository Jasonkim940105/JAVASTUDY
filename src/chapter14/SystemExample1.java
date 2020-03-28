package chapter14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemExample1 {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        /*try{
            while (true){
                char ch = (char) reader.read();
                System.out.println("입력된 문자: " + ch);
                if( ch== '.')
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        BufferedReader reader2 = new BufferedReader(reader);
        try {
            String str = reader2.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
