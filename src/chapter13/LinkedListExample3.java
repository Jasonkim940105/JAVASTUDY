package chapter13;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample3 {
    public static void main(String[] args) {

        /*
            Linked list 의경우 데이터간이 link 를 이용해 다음 데이터를 가져올 수 있다.
            따라서 일반적인 get 메소드를 for문을 사용해서 데이터를 가져온다면
            3번 인덱스를 가져올때도 0번째부터 연결을 타고들어가고, 4번인덱스를 가져올때도 0번째부터 연결을 타고 들어가야함으로
            마지막에 읽은 데이터의 위치를 기억하고 있는 iterator 를 사용하는게 상당히 효율적이다.
         */

        LinkedList<String> list = new LinkedList<>();
        list.add("망고");
        list.add("파인애플");
        list.add("바나나");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
