package chapter17;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class ObjectOutputStreamExample3 {
    public static void main(String[] args) {

        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("output3.dat"));
            BBSItem obj = new BBSItem("최선희", "sunshine", "정모합시다", "이번주 주말 어떠세요?");
            obj.addAttachment("룰룰랄라 첨부파일");
            System.out.println("전체게시물의 수: " + obj.itemNum);
            System.out.println("글쓴이: " + obj.writer);
            System.out.println("패스워드: " + obj.password);
            System.out.println("제목: "  + obj.title);
            System.out.println("내용: "  +obj.content);
            System.out.println("첨부: " + obj.attachment);

            out.writeObject(obj);

        } catch (IOException e) {
            System.out.println("파일로 출력할 수 없습니다. ");
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
