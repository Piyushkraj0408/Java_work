import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.printf("The first integer :- ");
        int a = sc.nextInt();
        System.out.printf("The second integer :- ");
        int b = sc.nextInt();
        System.out.printf("The third integer :- ");
        int c = sc.nextInt();
        System.out.printf("The greatest integer is :- ");
        if(a>b && a>c){
            System.out.println(a);
        } else if(b>c){
            System.out.println(b);
        } else{
            System.out.println(c);
        }
        System.out.println(name);
    }
}