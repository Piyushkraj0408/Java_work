sealed class Human permits Akash,Ashish{
    public void info(){
        System.out.println("Human class");
    }
}
non-sealed class Akash extends Human{
    public void info(){
        System.out.println("Hello students, i am Akash");
    }
}
non-sealed class Ashish extends Human{
    public void info(){
        System.out.println("Hello , i am ashish");
    }
}


public class seal {
    public static void main(String[] args) {
        Human h1 = new Akash();
        Human h2 = new Ashish();
        h1.info();
        h2.info();
    }
}
