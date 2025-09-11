class a{
    void  me(){
        System.out.println("I am piyush kumar raj");
    }
}

class b extends a{
    void me(){
        System.out.println("My name is Akash kumar");
    }
}

class c extends a{
    void me(){
        System.out.println("My name is Pranjal gautam");
    }
}

public class polymor {
    public static void main(String name){
        System.out.println("hi I am piyush");
    }
    public static void main(int n){
        System.out.println("hi I am piyush");
    }
    public static void main(String[] args){
        polymor name = new polymor();
        name.main(9);
    }
}
//most importantant asked in the interview
