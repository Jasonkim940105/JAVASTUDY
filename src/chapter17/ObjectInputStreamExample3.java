package chapter17;

import java.io.*;

public class ObjectInputStreamExample3 {
    public static void main(String[] args) {

        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("output3.dat"));
            BBSItem obj = (BBSItem)in.readObject();
            System.out.println("전체게시물 수 : " + obj.itemNum);  // static 필드는 직렬화 x
            System.out.println("글쓴이 : "  +obj.writer);
            System.out.println("패스워드 : " + obj.password); // transient 를 붙인 필드는 직렬화 x
            System.out.println("제목 : " + obj.title );
            System.out.println("내용 : " + obj.content );
            System.out.println("첨부 : " + obj.attachment);
        } catch (FileNotFoundException fne) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (EOFException eofe) {
            System.out.println("파일 다읽음");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException cnfe){
            System.out.println("해당클래스가 존재하지 않습니다.");
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
