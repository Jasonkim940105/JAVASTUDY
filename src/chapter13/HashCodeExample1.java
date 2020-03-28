package chapter13;

public class HashCodeExample1 {
    public static void main(String[] args) {
        /*
         사용자가 작성한 key 값을 가지고 hashcode 를 내부적으로 생산해 그 hashcode를 통해 해당 인덱스로 value 를 할당한다

         */

        String obj1 = new String("헤르미온느");
        String obj2 = new String("헤르미온느");
        String obj3 = new String("해르미온느");

        int hash1 = obj1.hashCode();
        int hash2 = obj2.hashCode();
        int hash3 = obj3.hashCode();
        System.out.println(hash1);
        System.out.println(hash2);
        System.out.println(hash3);


    }
}
