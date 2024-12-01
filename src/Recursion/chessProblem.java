package Recursion;

public class chessProblem {
   public static void f(int i,int j,int m,int n,String output){
       if(i == m-1 && j == n-1){
           System.out.println(output);
       }
       if(j >= n || i >= n){
           return;
       }
       f(i,j+1,m,n,output+"R");
       f(i+1,j,m,n,output+"D");

   }
    public static void main(String[] args) {
        f(0,0,3,3,"");
    }
}
