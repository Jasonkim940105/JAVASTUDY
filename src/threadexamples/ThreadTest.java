package threadexamples;

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 0 ; i < 200; i++){
            System.out.print(i + "\t");
            try{
                sleep(100);
            } catch (InterruptedException ie){}

        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {

        System.out.println("start");
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
        System.out.println("end");
    }
}
