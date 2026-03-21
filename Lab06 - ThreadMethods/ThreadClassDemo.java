class MyThread extends Thread {

    public void run() {

        for(int i = 1; i <= 5; i++) {
            System.out.println(getName() + " running: " + i);

            try {
                Thread.sleep(500);
            } catch(Exception e) {}

            Thread.yield();
        }
    }
}

public class ThreadClassDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("First Thread");
        t2.setName("Second Thread");

        t1.setPriority(Thread.NORM_PRIORITY + 2);
        t2.setPriority(Thread.NORM_PRIORITY - 2);

        System.out.println("Priority of t1: " + t1.getPriority());
        System.out.println("Priority of t2: " + t2.getPriority());

        t1.start();

        try {
            t1.join();
        } catch(Exception e) {}

        t2.start();
    }
}