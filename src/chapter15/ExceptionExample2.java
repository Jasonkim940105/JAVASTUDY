package chapter15;

public class ExceptionExample2 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 0;
        int result = num1 / num2 ;
        System.out.println(result);

        // -> RuntimeException 의 ArithmeticException / by zero  : RuntimeException -> unchecked Exception
    }
}
