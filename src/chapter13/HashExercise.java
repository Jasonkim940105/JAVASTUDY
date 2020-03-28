package chapter13;

import java.util.HashMap;
import java.util.Scanner;

class Person {
    String phoneN;
    String addr;

    public Person( String phoneN, String addr) {
        this.phoneN = phoneN;
        this.addr = addr;
    }
}

public class HashExercise {
    public static void main(String[] args) {
        HashMap<String, Person> personHash = new HashMap<>();
        personHash.put("김종하", new Person("010-1111-2222", "경주"));
        personHash.put("배민주", new Person("010-2222-3333", "대전"));

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();

        System.out.println(name + "의 번호는 " + personHash.get(name).phoneN);
        System.out.println(name + "의 주소는 " + personHash.get(name).addr);


    }
}
