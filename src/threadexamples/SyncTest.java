package threadexamples;

class Bank {
    private int money = 10000;

    public synchronized void saveMoney(int save){ // 메소드에 synchronized 를 걸면 메소드가 속해있는 class 에 lock 이 걸림 (saveMoney() 가 수행될 동안 Bank에 다른 쓰레드 접근 x )
        int m = this.getMoney();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m + save);
    }

    public  void minusMoney(int minus){
        synchronized (this){ // () 안에 lock 을 걸 객체
            int m = this.getMoney();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setMoney(m - minus);
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread{
    @Override
    public void run() {
        System.out.println("start save");
        SyncTest.myBank.saveMoney(3000);
        System.out.println("complete save "  + SyncTest.myBank.getMoney());
    }
}

class ParkWife extends Thread{
    @Override
    public void run() {
        System.out.println("start minus");
        SyncTest.myBank.minusMoney(1000);
        System.out.println("minus money " + SyncTest.myBank.getMoney());
    }
}

public class SyncTest {

    public static Bank myBank = new Bank();

    public static void main(String[] args) {

        Park p = new Park();
        p.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*try {
            p.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        ParkWife pw = new ParkWife();
        pw.start();




    }
}
