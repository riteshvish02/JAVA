package Recursion;

public class friendpairing {
    public static int f(int n){
        if(n ==1 || n == 2) return n;
        return f(n-1) + f(n-2)*(n-1);

    }
    public static void main(String[] args) {
       int arr[] = {1,2,3};//friends
        System.out.println(f(arr.length));
    }
}
