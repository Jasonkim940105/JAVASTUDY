package chapter13;

import java.util.LinkedList;

public class StackExample1 {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addLast(new Integer(12));
        stack.addLast(new Integer(59));
        stack.addLast(new Integer(7));
        while (!stack.isEmpty()){
            Integer num = stack.removeLast();
            System.out.print(num + " ");
        }


    }
}
