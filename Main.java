public class Main {
    public static void main(String[] args) {
        Daemon thread1 = new Daemon("send thread 1");
        Daemon thread2 = new Daemon("save thread 2");
        Daemon thread3 = new Daemon("attach thread 3");
        thread3.setDaemon(true);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Daemon extends Thread {
    public Daemon(String name) {
        super(name);
    }

    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is daemon");
        } else {
            System.out.println(getName() + " is a user thread");
        }
    }
}
