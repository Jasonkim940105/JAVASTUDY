package chapter18.example5;

class TransferThread extends Thread {
    SharedArea sharedArea;

    TransferThread(SharedArea area){
        sharedArea = area;
    }

    @Override
    public void run() {
            for (int i = 0; i < 12; i++) {
                synchronized (sharedArea){
                    sharedArea.account1.withdraw(100000);
                    System.out.print("jaden 계좌 : 100000원 인출, ");
                    sharedArea.account2.deposit(100000);
                    System.out.println("ming 계좌 : 100000원 입금");
                }
        }
    }
}

class PrintThread extends Thread{
    SharedArea sharedArea;
    PrintThread(SharedArea area){
        sharedArea = area;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (sharedArea){
                int sum = sharedArea.account1.balance + sharedArea.account2.balance;
                System.out.println("계좌잔액 합계 " + sum);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
