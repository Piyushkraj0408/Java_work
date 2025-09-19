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
//There are seven interfaces in collections and 3 interfaces in map
//Duplicates are allowed and insertion order is preserved