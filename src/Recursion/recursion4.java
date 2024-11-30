package Recursion;

public class recursion4 {
    public static void f(String str,int idx,String output){
        if(idx == str.length()){
            System.out.println(output);
            return;
        }else{
            f(str,idx+1,output+str.charAt(idx));
            f(str,idx+1,output);
        }
    }
    public static void main(String[] args) {
         String str = "abc";
         int idx = 0;
         f(str,idx,"");
    }
}
