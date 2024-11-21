package Recursion;

public class recursion3 {
    //pattern print
//    public static void printstars(int n){
//        if(n<=0) return;
//        System.out.print("x");
//        printstars(n-1);
//    }
    public static void f(int row,int col,int star){
        if(row > star) return;
        if(col > star){
            System.out.println();
            f(row+1,1,star);
        }else{
            System.out.print("*");
            f(row,col+1,star);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        f(1,1,n);
    }
}
