
interface Printable{
    void print();
}

interface showable{
    void show();
}
class Demo implements Printable,showable{
    public void print(){
        System.out.println("Printing.....");
    }
    public void show(){
        System.out.println("Showing.......");
    }
}

public class interf {
    public static void main(String[] args){
        //Demo obj = new Demo();
        //obj.print();
        //obj.show();
        Printable p = new Demo();
        showable s = new Demo();
        p.print();
        s.show();
    }
}
