package pac2;

import pac1.parent;

//import pac1.parent;
public class child {
    public void showAccess(){
        parent obj = new parent();
        //System.out.println(c);
        System.out.println(obj.d);
    }
    public static void main(String[] args){
        child obj = new child();
        obj.showAccess();
    }
}
