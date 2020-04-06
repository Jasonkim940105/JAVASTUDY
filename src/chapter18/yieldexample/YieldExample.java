package chapter18.yieldexample;

public class YieldExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();

        try {
            Thread.sleep(1000); // 1초뒤에
        } catch (InterruptedException e) { }
        threadA.work = false; //메인쓰레드가 threadA의 work 를 false 로 상태변경 시켜 threadA가 스케쥴러에 의해 실행될때 yield 상태이기때문에 다른 thread 를 실행시킴

        try {
            Thread.sleep(1000); // 1초뒤에
        } catch (InterruptedException e) { }
        threadA.work = true; //메인쓰레드가 threadA의 work 를 true 로 상태변경 시켜 threadA가 스케쥴러에 의해 실행되면 threadA 가 실행된다.

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { }
        threadA.threadWork= false; // 메인쓰레드가 실행되어 threadA의 상태를 변경함으로써 threadA가 종료된다. stop()과 같은 메소드는 프로그램을 불안정하게 만들기때문에 이런식으로 쓰레드를 종료시키는 방법이 권장된다.

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { }
        threadB.threadWork= false;

    }
}
