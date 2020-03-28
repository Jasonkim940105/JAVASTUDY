package chapter13;


import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
    public static void main(String[] args) {

        /*
          HashSet 은 수학의 집합과 같은 개념. 중복된 데이터는 드러가자 앟는다.
          집합에 특정 데이터가 있는지 확인할 수 있는 contains 메소드 , 삭제 remove 메소드, 집합을 비우는 clear 메소드 등이있다.
          데이터에 순서가 없이 저장된다.
         */
        HashSet<String> set = new HashSet<>();
        set.add("자바");
        set.add("카푸치노");
        set.add("에스프레소");
        set.add("자바");
        System.out.println("set에 저장된 데이터의 갯수 : " + set.size());
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
