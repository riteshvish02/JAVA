package Oops.day1;

public class basics {
    public static void main(String[] args) {
        Cycle bicycle = new Cycle();
//        System.out.println(bicycle.gear);
//        bicycle.brakes();
        Complex obj1 = new Complex();
        System.out.println(obj1.a+" "+obj1.b);
        Complex obj2 = new Complex(2);
        System.out.println(obj2.a + " " + obj2.b);
        Complex obj3 = new Complex(3,5);
        System.out.println(obj3.a + " " + obj3.b);
    }
}
class Cycle{
    int gear = 5;
    void brakes(){
        System.out.println("brakingg");
    }
}
class Complex{
    //use of this keyword
     public int a;
     public int b;
    Complex(){
        this(0,0);
    }
    Complex(int a,int b){
        this.a = a;
        this.b = b;
    }
    Complex(int a){
        this(a,a);
    }
}
