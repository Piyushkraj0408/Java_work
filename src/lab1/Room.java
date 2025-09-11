package lab1;

import java.util.Scanner;

public class Room {
    public static void main(String[] args){
        Main a = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the room number: ");
        int rn = sc.nextInt();
        System.out.println("Enter the type of room : ");
        String rt = sc.next();
        System.out.println("Enter the area of room: ");
        double ra = sc.nextDouble();
        System.out.println("Enter the Room has Ac or Not");
        boolean am = sc.nextBoolean();
        a.setdata(rn,rt,ra,am);
        a.displaydata();
    }
}
class Main{
    int roomno;
    String roomtype;
    double roomarea;
    boolean Acmachine;
    public void setdata(int rn,String rt,double ra,boolean am){
        rn = roomno;
        rt = roomtype;
        ra = roomarea;
        am = Acmachine;
    }
    public void displaydata(){
        System.out.println("Room number = " + roomno);
        System.out.println("Room Type = " + roomtype);
        System.out.println("Room Area = " + roomarea);
        System.out.println("Room AcMachine = " + Acmachine);
    }
}
