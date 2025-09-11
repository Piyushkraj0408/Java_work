class ani{
    public void cat(){
        System.out.println("She is a cat");
    }
    public void cat(String s){
        System.out.println("She is a "+ s);
    }
}
class Ocean{
    public void fish() {
        System.out.println("This is tasty");
    }
}
class Aqua{
    public void fish(){
        System.out.println("This is living being");
    }
}
abstract class kurama {
    abstract public void kurama();
    void naruto(){
        System.out.println("I have Rassingaan");
    }
}

public class lab1 {
    public static void main(String[] args){
        ani a = new ani();
        a.cat();
        a.cat("Kitty");
        Ocean b = new Ocean();
        b.fish();
        Aqua z = new Aqua();
        z.fish();
        kurama k = new kurama() {
            @Override
            public void kurama() {
                System.out.println("I have levitating powers");
            }
        };
        k.kurama();
        k.naruto();
    }
}
