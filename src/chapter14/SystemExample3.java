package chapter14;

public class SystemExample3 {
    public static void main(String[] args) {
        int [] arr1  = { 72, 14, 64, 99, 100, 0 , -25, 4 , -13, 11};
        int [] arr2  = { 4, -2, 0, 1, 33, 55, 3, -3 ,5 ,1 ,-33};
        for (int i = 0 ; i < arr1.length; i++){
            try {
                int result = arr1[i]/arr2[i];
                System.out.printf("%d / %d = %d %n", arr1[i], arr2[i], arr1[i]/arr2[i], result);
            } catch (Exception e) {
                System.err.println("잘못된 연산입니다.");
            }


        }
    }
}
