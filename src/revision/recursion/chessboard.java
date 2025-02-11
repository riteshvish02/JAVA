package revision.recursion;

public class chessboard {
    public static void main(String[] args) {
        f(0,0,2,2,"");
    }
    public static void f(int r,int c,int m,int n,String output){
        if(r == m || c == n) return;
        if(r == m-1 && c == n-1){
            System.out.println(output);
        }
        f(r,c+1,m,n,output + "R");
        f(r+1,c,m,n,output + "D");


    }
}
