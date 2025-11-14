public class switch2 {
    public static void main(String[] args) {
        int a,b,r;
        a=1;
        b=2;
        enum c{Add,Sub,Mul,Div}
        r=switch (c.Add){
            case Add -> a+b;
            case Sub -> a-b;
            case Mul -> a*b;
            case Div -> a-b;
            default -> -1;
        };
        System.out.println("result : "+r);
    }
}
