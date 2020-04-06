package chapter18.joinexample;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();

        sumThread.start();

        try {
            sumThread.join(); // main thread 가 정지상태가 되고, sumThread 가 다 실행된 후에 main thread 가 run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(sumThread.getSum());
    }
}
