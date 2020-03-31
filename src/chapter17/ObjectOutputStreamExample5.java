package chapter17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample5 {
    public static void main(String[] args) {
        ObjectOutputStream out  = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("output5.dat"));
            DistrChart obj = new DistrChart();
            obj.arr[0][1] = 2;
            obj.arr[4][5] = 5;
            obj.arr[6][1] = 2;
            obj.arr[7][7] = 7;
            obj.arr[8][4] = 21;
            out.writeObject(obj); // 디폴트된 메소드가 아닌 DistrChart 에 정의한 writeObject 메소드가 호출된다.
        } catch (IOException e) {
            System.out.println("파일로 출력할 수 없습니다.");
        } finally {
            try {
                out.close();
            } catch (IOException e) {
            }
        }
    }
}
