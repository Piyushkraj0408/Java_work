package lab7;

public class Thread1 implements Runnable{
    public void run(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Thread1 d = new Thread1();
        Thread ok = new Thread(d);
        Thread1 p = new Thread1();
        Thread ok1 = new Thread(p);
        ok.start();
        ok1.start();
    }
}
