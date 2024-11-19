package Recursion;

public class recursion1 {
//    public static int f(int n){
//        //factorial
//        if(n==0 || n==1) return 1;
//        return n*f(n-1);
//    }

//    public static int f(int a,int b){
    //a^b
//        if(b == 0) return 1;
//        return a*f(a,b-1);
//    }

//    public static void f(int n){
//        if(n==0) return;
//        System.out.println(n);
//        f(n-1);
//    }
    public static void f(int n){
        if(n==0) return;
        f(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
//        int n = 5;
//        System.out.println(f(n));

        //power calculate
//        int a = 2;
//        int b = 3;
//        System.out.println(f(a,b));

        //print n natural no. in decreasing order
//        int n = 5;
//        f(n);

        //print n natural no. ascending order;
        int n = 5;
        f(n);
    }
}
