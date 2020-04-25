package threadexamples;

public class JoinTest extends  Thread {

    int start;
    int end;
    int total;

    public JoinTest(int start, int end){
        this.start = start;
        this.end = end;

    }

    @Override
    public void run() {
        for(int i = start; i <=  end ; i++){
            total += i;
        }
    }

    public static void main(String[] args) {

        JoinTest jt1 = new JoinTest(1,50);
        JoinTest jt2 = new JoinTest(51,100);

        jt1.start();
        jt2.start();

        try{
            jt1.join();
            jt2.join();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

        // main 에서 join 을 걸었기 때문에 main 은 join1 과 join2 쓰레드가 종료될때가지 main 쓰레드는 non-runnable, 종료되면 main 이 runnable 상태가됨

        int total = jt1.total + jt2.total;
        System.out.println("jt1.total = " + jt1.total);
        System.out.println("jt2.total = " + jt2.total);
        System.out.println("total = " + total);

    }
}
