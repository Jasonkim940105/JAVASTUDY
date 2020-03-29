package chapter15;

public class ExceptionExample6 {
    public static void main(String[] args) {
        int num1 = 2, num2 = 3;

        try{
            int result = num1 - num2;
            if (result < 0 ) {
                throw new Exception("잘못된 결과입니다.");
            }
                System.out.println(result);
        } catch (Exception e ){
            System.out.println(e.getMessage());
        }

        // 직접 throw 하는 익셉션 객체에는 파라미터로 넘겨준 문자열이 에러 메세지로 설정된다
    }
}
