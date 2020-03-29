package chapter15;

public class ExceptionExample7 {
    public static void main(String[] args) {

        // printStackTrace 를 사용하면 익셉션이 발생한 클래스와 메소드의 이름, 소스코드에서의 행번호까지 출력. 개발 단계 디버깅 모드에서 유용

        try{
            int arr[] = new int[0];
            System.out.println("합계: " +  getTotal(arr));
            System.out.println("평군: " + getAverage(arr));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    static double getAverage(int arr[]) throws Exception{
        if(arr.length ==0)
            throw new Exception("비어있는 배열입니다.");
        return getTotal(arr) / arr.length;
    }
    static int getTotal(int arr[]) throws  Exception{
        if(arr.length == 0)
            throw new Exception("비어있는 배열입니다.");
        int total = 0 ;
        for(int num : arr){
            total += num ;
        }
        return total;
    }
}
