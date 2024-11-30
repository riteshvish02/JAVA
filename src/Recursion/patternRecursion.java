package Recursion;

public class patternRecursion {
//    public static void f(int row,int col,int star){
//     reverse pattern

//        if(star <= 0) return;
//        if(col > star){
//            System.out.println();
//            f(row+1,1,star-1);
//        }else{
//            System.out.print("*");
//            f(row,col+1,star);
//        }
//    }
//    public static void main(String[] args) {
//        //reverse pattern
//        int n = 4;
//        f(1,1,n);
//    }

    public static void f(String str,int idx,String output){

        if(idx >= str.length()) return;
        if(str.charAt(idx) != 'x'){
            System.out.print(output + str.charAt(idx));
        }
        f(str,idx+1,output);
    }
    public static void main(String[] args) {
        String str = "xxabcxnm";
        int idx = 0;
        f(str,idx,"");
    }
}
