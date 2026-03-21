class MyRunnable implements Runnable {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Running: " + i);

            try {
                Thread.sleep(500); // sleep method
            } catch(Exception e) {
                System.out.println(e);
            }

            Thread.yield(); // yield method
        }
    }
}

public class RunnableThreadDemo {

    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.setPriority(Thread.MAX_PRIORITY); // set priority
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Priority of t1: " + t1.getPriority());
        System.out.println("Priority of t2: " + t2.getPriority());

        t1.start();

        try {
            t1.join(); // join method
        } catch(Exception e) {}

        t2.start();
    }
}