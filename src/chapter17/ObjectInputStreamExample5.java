package chapter17;

import java.io.*;

public class ObjectInputStreamExample5 {
    public static void main(String[] args) {

        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("output5.dat"));
            DistrChart obj = (DistrChart)in.readObject();
            for(int row=0; row < obj.arr.length; row++){
                for(int col=0; col <obj.arr[row].length; col ++){
                    System.out.printf("%3d", obj.arr[row][col]); //%3d 하면 3자리수보다 작은 정수들이 오른쪽에 맞춰서 출력 %-3d 하면 왼쪽에 맞춰서 출력
                }
                System.out.println();
            }
        } catch (FileNotFoundException fnfe){
            System.out.println("해당파일이 존재하지 않습니다.");
        } catch (EOFException eofe){
            System.out.println("파일 다 읽음");
        } catch (ClassNotFoundException cnfe){
            System.out.println("해당클래스가 존재하지 않습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
