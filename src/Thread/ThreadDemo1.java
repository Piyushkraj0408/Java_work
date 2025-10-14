package Thread;

public class ThreadDemo1 extends Thread{
    public void run(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        ThreadDemo1 d = new ThreadDemo1();
        d.start();
        //d.start(); can not call it again when one time run executed.
    }
}
