package chapter13;

import java.util.HashMap;

public class HashMapExample1 {
    public static void main(String[] args) {

        /*
            HashTable 자료형의 경우 key , value 를 가지는 특성을 가지고 있다.
            value 를 key 에 mapping 하는 형태를 가지게 되고
            인덱스 역할을 하는 key 는 당연히 중복될 수 없고, value 는 중복될 수 있다.
            하나의 key 에 너무많은 value 들이 중복되지않도록 알고리즘을 만드는 것이 hashtable 을 효율적으로 사용하는 방법이겠지???

         */
        HashMap<String, Integer> hashTable = new HashMap<>();
        hashTable.put("해리", new Integer(95));
        hashTable.put("헤르미온느", new Integer(100));
        hashTable.put("론", new Integer(85));
        hashTable.put("드레이코", new Integer(93));
        hashTable.put("네빌", new Integer(70));
        Integer num = hashTable.get("헤르미온느");
        System.out.println("헤르미온느의 성적은 " + num + " 입니다.");
    }
}
