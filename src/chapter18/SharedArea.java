package chapter18;

class SharedArea {
    double result;
    boolean isReady;
}

class CalcThread extends Thread{
    SharedArea sharedArea;
    @Override
    public void run() {
        double total = 0.0;
        for(int i = 1 ; i < 1000000000; i += 2){
            if(i / 2%2 ==0){
                total += 1.0 / i;
            } else
                total -= 1.0/ i;
            sharedArea.result = total * 4;
            sharedArea.isReady = true;

        }
    }
}


class PrintThread extends Thread{
    SharedArea sharedArea;
    @Override
    public void run() {
        while (sharedArea.isReady!=true)
            continue;
        System.out.println(sharedArea.result);
    }
}

