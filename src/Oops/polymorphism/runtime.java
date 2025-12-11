package Oops.polymorphism;

public class runtime extends overridden {
    @Override
    void greet() {
        System.out.println("greet runtime");
    }

    public static void main(String[] args) {
        runtime rn = new runtime();
        rn.greet();
    }
}
class overridden{
    void greet(){
        System.out.println("greet overridden");
    }
}
