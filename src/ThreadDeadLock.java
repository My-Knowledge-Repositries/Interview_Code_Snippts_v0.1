// thread deadlock
public class ThreadDeadLock {
    public static void main(String[] args) throws InterruptedException {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        Thread t1 = new Thread(new SyncThread(obj1, obj2), "t1");
        Thread t2 = new Thread(new SyncThread(obj2, obj3), "t2");
        Thread t3 = new Thread(new SyncThread(obj3, obj1), "t3");

        t1.start();
        Thread.sleep(5000);
        t2.start();
        Thread.sleep(5000);
        t3.start();
    }
}

class SyncThread implements Runnable {
    private final Object ob1;
    private final Object ob2;

    public SyncThread(Object ob1, Object ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " aquiring lock on " + ob1);
        synchronized (ob1) {
            System.out.println(name + " acquired lock on " + ob1);
            work();
            System.out.println(name + " acquired lock on " + ob2);
            synchronized (ob2) {
                System.out.println(name + " acquired lock on " + ob2);
                work();
            }
            System.out.println(name + " released lock on " + ob2);
        }
        System.out.println(name + " released lock on " + ob1);
        System.out.println(name + " finished execution. ");
    }

    private void work() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
