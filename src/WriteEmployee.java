import java.util.Scanner;

class Employe{
    private int empNo;
    private String empName;
    private int empBasic;
    private int empphno;
    Employe(int s,String name,int sal,int empp){
        empNo = s;
        empName = name;
        empBasic = sal;
        empphno = empp;
    };
    void display(){
        System.out.println(empName);
        System.out.println(empBasic);
        System.out.println(empNo);
        System.out.println(empphno);
    }
}
public class WriteEmployee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of employee: ");
        System.out.println("Enter the employee id:");
        int epid = sc.nextInt();
        System.out.println("Enter the employee salary");
        int empsal = sc.nextInt();
        System.out.println("Enter the employee name");
        String empname = sc.next();
        System.out.println("Enter the employee phone no.");
        int empp = sc.nextInt();
        Employe p = new Employe(epid,empname,empsal,empp);
        p.display();
    }
}
