/*
package chapter20;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample1 {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("172.30.1.9", 8080);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            String str = "Hello Server";
            out.write(str.getBytes());
            // 데이터 송신
            byte arr[] = new byte[100];
            in.read(arr);
            System.out.println(new String(arr));


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

}
*/
