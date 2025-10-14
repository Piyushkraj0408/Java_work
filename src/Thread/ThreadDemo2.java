package Thread;

public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        ThreadDemo2 d = new ThreadDemo2();
        Thread t = new Thread(d);
        t.start();
    }
}
