package chapter18.example5;

public class MultithreadExample5 {
    public static void main(String[] args) {
        SharedArea area = new SharedArea();

        area.account1 = new Account("111-222-333", "jaden", 3000000);
        area.account2 = new Account("222-333-444", "ming", 3000000);

        TransferThread thread1 = new TransferThread(area);
        PrintThread thread2 = new PrintThread(area);
        thread1.start();
        thread2.start();

    }
}
