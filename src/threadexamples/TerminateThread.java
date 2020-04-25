package threadexamples;

import java.io.IOException;

public class TerminateThread extends Thread {

    private boolean flag = true;

    @Override
    public void run() {
        while (flag){
            try {
                sleep(10);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(getName() + " END ! ");
    }

    public void setFlag(boolean flag){
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {

        TerminateThread t1 = new TerminateThread();
        TerminateThread t2 = new TerminateThread();

        t1.start();
        t2.start();

        int in;
        while (true){
            in = System.in.read();
            if(in =='S'){
                t1.setFlag(false);
                t2.setFlag(false);
                break;
            }
        }
        System.out.println("MAIN END ");




    }
}
