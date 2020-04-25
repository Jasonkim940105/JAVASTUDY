package threadexamples;

import java.util.ArrayList;

class FastLibrary{
    public ArrayList<String> books = new ArrayList<>();

    public FastLibrary(){
        books.add("태백산맥 1");
        books.add("태백산맥 2");
        books.add("태백산맥 3");

    }

    public synchronized String lendBook(){

        Thread t = Thread.currentThread();
        while(books.size() == 0 ){
            System.out.println(t.getName() + " waiting");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t.getName() + " waiting end");
        }

        String title = books.remove(0);
        System.out.println(t.getName() +  " : "  + title +  " lend");
        return title;
    }

    public synchronized void returnBook(String title){

        books.add(title);
        notifyAll();
        System.out.println(Thread.currentThread().getName() + " : "  + title + " return");

    }
}

class Student extends Thread{
    @Override
    public void run() {
        String title = LibraryMain.lbrary.lendBook();

        try {
            if(title == null) return;
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LibraryMain.lbrary.returnBook(title);


    }

}

public class LibraryMain {
    public static FastLibrary lbrary = new FastLibrary();

    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        Student st5 = new Student();
        Student st6 = new Student();


        st1.start();
        st2.start();
        st3.start();
        st4.start();
        st5.start();
        st6.start();


    }
}
