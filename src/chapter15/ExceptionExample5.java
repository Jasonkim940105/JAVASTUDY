package chapter15;

public class ExceptionExample5 {
    public static void main(String args[]){
        int num1 = 2, num2 = 0;
        try{
            int result = num1 / num2 ;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
