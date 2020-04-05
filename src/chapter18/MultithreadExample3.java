package chapter18;

public class MultithreadExample3 {
    public static void main(String[] args) {

        char arr[] = {'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ','ㅂ','ㅅ','ㅇ',
                'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};
/*
        SmallLetters obj = new SmallLetters();
        Thread thread = new Thread(obj);
*/
        Thread thread = new Thread(new SmallLetters());

        for(char c : arr){
            System.out.print(c);
        }

        thread.start();


    }
}

class SmallLetters implements Runnable{
    @Override
    public void run() {
        for(char i = 'a' ; i <= 'z'; i++){
            System.out.print(i);
        }
    }
}
