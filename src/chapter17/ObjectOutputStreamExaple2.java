package chapter17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class GoodStock implements java.io.Serializable{
    String code;
    int num;

    public GoodStock(String code, int num) {
        this.code = code;
        this.num = num;
    }

    void addStock(int num){
        this.num += num;
    }

    int subtractStock(int num) throws Exception{
        if(num > this.num){
            throw new Exception("재고가 부족합니다");
        }
        this.num -= num;
        return num;
    }
}

public class ObjectOutputStreamExaple2 {
    public static void main(String[] args) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("output2.dat"));
            out.writeObject(new GoodStock("70101", 100));
            out.writeObject(new GoodStock("70102", 50));
            out.writeObject(new GoodStock("70103", 200));
        } catch (IOException e) {
            System.out.println("파일로 출력할 수 없습니다.");
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
