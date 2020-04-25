package threadexamples;

class MyTrhead2  implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i < 200; i++){
            System.out.print(i + "\t");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadTest2 {
    public static void main(String[] args) {
        System.out.println("Start");
        MyTrhead2 myTrhead1 = new MyTrhead2();
        MyTrhead2 myTrhead2 = new MyTrhead2();
        Thread thread1 = new Thread(myTrhead1);
        Thread thread2 = new Thread(myTrhead2);
        thread1.start();
        thread2.start();
        System.out.println("End");
    }
}
