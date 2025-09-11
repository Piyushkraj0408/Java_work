
interface it {
    public static final int x = 10;
}


class MyInterface implements it{
    public static void main(String[] args){
        it i = new MyInterface();
        System.out.println(it.x);
        //i.x = 20;
    }

}

