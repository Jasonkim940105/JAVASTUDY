package chapter13;

import java.util.LinkedList;

public class QueueExample1 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("강아지");
        queue.offer("사슴");
        queue.offer("호랑이");

        while (!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
    }
}
