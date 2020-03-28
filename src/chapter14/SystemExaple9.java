package chapter14;

public class SystemExaple9 {
    public static void main(String args[]){
        char arr1[] = {'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i'};
        char arr2[] = new char[30];
        System.arraycopy(arr1,3, arr2, 5, 4);
        for(int i = 0 ; i < arr2.length; i++){
            System.out.print(arr2[i]);
        }
    }
}
