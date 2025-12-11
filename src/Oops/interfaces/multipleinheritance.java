package Oops.interfaces;

public class multipleinheritance{

    public static void main(String[] args) {
        pet p1 = new pet();
        p1.sound();
        p1.speciality();

    }
}

interface animal{
    void sound();
    default void eats(){
        System.out.println("yess"); //default is important here
    }
}
interface mammals{
    void speciality();

}

class pet implements animal,mammals{
    public void sound(){
        System.out.println("bark");
    };
    public void speciality(){
        System.out.println("run");
    }
}
