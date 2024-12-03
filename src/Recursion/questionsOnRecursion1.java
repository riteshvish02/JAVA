package Recursion;

public class questionsOnRecursion1 {
    public static int f(int n){
        if(n == 1 || n == 2) return n;
        return f(n-1 ) + (n-1)*f(n-2);
    }
    public static void main(String[] args) {
//       que. Given n friends, each one can remain single or can be paired up
//        with some other friend. Each friend can be paired only once. Find out the total
//        number of ways in which friends can remain single or can be paired up.
        System.out.println(f(4));
    }
}
