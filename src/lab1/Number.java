package lab1;

import java.util.Scanner;

class check {
    private double a;
    public check(double a) {
        this.a = a;
    }

    public boolean isZero(){
        if(a==0){
            return true;
        }
        return false;
    }
    public boolean isPositive(){
        if(a>0){
            return true;
        }
        return false;
    }
    public boolean isNegative(){
        if(a<0){
            return true;
        }
        return false;
    }
    public boolean isOdd(){
        if(a%2!=0){
            return true;
        }
        return false;
    }
    public boolean isEven(){
        if(a%2==0){
            return true;
        }
        return false;
    }
    public boolean isPrime(){
        for(int i=2;i<a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean isArmstrong(){
        int n=0;
        int s;
        while(a!=0){
            s= (int) (a%10);
            n=n*10+s;
            a=a/10;
        }
        if(n==a){
            return true;
        }
        return false;
    }
}

public class Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        check a = new check(b);
        System.out.println("Zero = " + a.isZero());
        System.out.println("ArmStrong = " + a.isArmstrong());
        System.out.println("Even = " + a.isEven());
        System.out.println("Odd = " + a.isOdd());
        System.out.println("Negative = " + a.isNegative());
        System.out.println("Positive = " + a.isPositive());
        System.out.println("Prime = " + a.isPrime());
    }
}
