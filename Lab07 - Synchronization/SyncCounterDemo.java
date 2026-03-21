class Counter {

    int count = 0;

    synchronized void increment() { // synchronized method
        count++;
        System.out.println(Thread.currentThread().getName() + " Count: " + count);
    }
}

class MyThread extends Thread {

    Counter c;

    MyThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for(int i = 0; i < 5; i++) {
            c.increment();
        }
    }
}

public class SyncCounterDemo {

    public static void main(String[] args) {

        Counter c = new Counter();

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        MyThread t3 = new MyThread(c);
        MyThread t4 = new MyThread(c);
        MyThread t5 = new MyThread(c);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}