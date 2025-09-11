class Animal{
    void eat(){
        System.out.println("this animal eats food.");
    }
}

class Dog{
    Animal a = new Animal();
    void bark(){
        a.eat();
        System.out.println("The dog barks.");
    }
}
public class inheritence1 {
    public static void main(String[] args){
        Dog d = new Dog();
        d.bark();

    }
}
