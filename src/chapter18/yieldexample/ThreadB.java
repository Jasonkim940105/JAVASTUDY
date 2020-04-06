package chapter18.yieldexample;

public class ThreadB extends Thread {
    public boolean threadWork = true;
    public boolean work = true;

    @Override
    public void run() {
        while (threadWork){
             if(work){
                 System.out.println("ThreadB 작업내용");
             } else{
                 // work 가 false 시 해야할 일이 없을경우에  work 가 false  인 경우 yield 를 시켜놓지 않으면 무의미한 반복문을 돈다.
                Thread.yield();
             }
        }
        System.out.println("ThreadB 종료");
    }
}
