class emp{
    private int empNo;
    private String empName;
    private int empBasic;
    emp(int s,String name,int sal){
        empNo = s;
        empName = name;
        empBasic = sal;
    };
    void getter(){
        System.out.println(empName);
        System.out.println(empBasic);
        System.out.println(empNo);
    }
}

public class Employee {
    public static void main(String[] args){
        emp p = new emp(0021,"hritik",25000);
        p.getter();
    }
}
