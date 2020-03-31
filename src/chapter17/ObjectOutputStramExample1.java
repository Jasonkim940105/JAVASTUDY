package chapter17;

import java.io.*;
import java.util.GregorianCalendar;

public class ObjectOutputStramExample1 {
    public static void main(String[] args) {

        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("output.dat"));
            out.writeObject(new GregorianCalendar(2006, 0, 14));
            out.writeObject(new GregorianCalendar(2006, 0, 15));
            out.writeObject(new GregorianCalendar(2006, 0,16));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                out.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class DistrChart implements java.io.Serializable{
    int arr[][];
    DistrChart(){
        arr = new int[10][10];
    }

    private void writeObject(ObjectOutputStream out) throws IOException{
        for(int row = 0 ; row < arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                if(arr[row][col] !=0 ){
                    out.writeInt(row);
                    out.writeInt(col);
                    out.writeInt(arr[row][col]);
                }
            }
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        arr = new int[10][10];
        try {
            while(true){
                int row = in.readInt();
                int col = in.readInt();
                int data = in.readInt();
                arr[row][col] = data;
            }
        } catch (EOFException e){

        }
    }
}
