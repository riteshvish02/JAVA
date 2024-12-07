package Recursion;

public class question2 {
    public static int f(int n){
        if(n == 1 || n == 2 || n == 0) return n;
        return f(n-1) + f(n-2);
    }
    public static void main(String[] args) {
//        Given a “2 x n” board and tiles of size “2 x 1”, count
//        the number of ways to tile the given board using the 2 x 1
//        tiles. A tile can either be placed horizontally i.e.,
//        as a 1 x 2 tile or vertically i.e., as 2 x 1 tile.
        System.out.println( f(4));
    }
}
