package chapter18;

public class MultithreadExample2 {
    public static void main(String[] args) {

        DigitThread thread1 = new DigitThread();
        Thread thread2 = new DigitThread();
        Thread thread3 = new AlphabatThread();
        thread1.start();
        thread3.start();
        thread2.run();


    }
}

class AlphabatThread extends Thread{

    @Override
    public void run() {
        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
