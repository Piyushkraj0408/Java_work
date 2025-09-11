package lab2;

import java.util.Scanner;

public class largestsmall{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Number of input :- ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("input the " + i + " number:- ");
            a[i] = sc.nextInt();
        }
        int lar = a[0];
        int small=a[0];
        for(int i=0;i<n;i++){
            if(lar<a[i]){
                lar=a[i];
            }
            if(small>a[i]){
                small=a[i];
            }
        }
        System.out.printf("The largest number is :- ");
        System.out.println(lar);
        System.out.printf("The smallest number is :- ");
        System.out.println(small);
    }
}
