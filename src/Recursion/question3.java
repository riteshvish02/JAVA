package Recursion;

public class question3 {
    public static int count = 0;
    public static void f(double x,double N ,int i){
        if(x == 0) count++;
        if(i*i > x || Math.pow(i,N) > x) return;
        f(x-Math.pow(i,N),N,i+1);
        f(x,N,i+1);
    }
    public static void main(String[] args) {
        double x = 100;
        double N = 2;
        f(x,N,1);
        System.out.println(count);
    }
}
