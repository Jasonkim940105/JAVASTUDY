package chapter13;

import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {

        /*
         ArrayList 의 경우 생성시 10칸 짜리배열이 생성(필요시 자동으로 증가, 생성자 파라미터를 통해 크기 지정가능)
         그에 비해서 LinkedList 는 특정 영역을 생성하지 않고, add 메소드로 데이터를 담으면 데이터가 메모리의 랜덤한 영역에 저장
         그 다음 데이터를 add 시 첫 번째 데이터와 두번 째 데이터가 서로 가리키는 형태로 저장됨.
         set , remove , add 와 같은 메소드는 결국 데이터간의 연결관계를 끊고 맺음으로서 데이터간의 순서를 선형화 시킨다.
         */

        LinkedList<String> list = new LinkedList<>();
        list.add("포도");
        list.add("딸기");
        list.add("복숭아");

        int num = list.size();
        for (int i = 0; i < num; i++){
            String str = list.get(i);
            System.out.println(str);

        }
    }
}
