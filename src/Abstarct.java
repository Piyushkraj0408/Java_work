abstract class Turn {
    abstract void turnon();
    abstract void turnoff();
}

class Tvremote extends Turn{
    public void turnon(){
        System.out.println("TV is turning On");
    }
    public void turnoff(){
        System.out.println("TV is turning off");
    }

}
public class Abstarct {
    public static void main(String[] args){
        Turn i = new Tvremote();
        i.turnoff();
        i.turnon();
    }
}
