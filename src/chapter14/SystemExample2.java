package chapter14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemExample2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str = br.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
