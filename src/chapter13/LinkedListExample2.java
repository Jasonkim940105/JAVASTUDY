package chapter13;

import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("grape");
        list.add("banana");
        list.add("orange");
        list.add("tomato");
        list.add(2,"lemon");
        list.set(0,"kiwi"); // set 메소드 사용시 해당 index 의 기존 데이터는 삭제하고 , 새로운 데이터 삽입



        for(int i = 0 ;  i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
