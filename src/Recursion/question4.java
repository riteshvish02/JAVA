package Recursion;

public class question4 {
    public static void f(String str,int idx,String output){
        if(idx == str.length()){
            System.out.println(output);
            return;
        }

//        char firstChar = (char) ('A' + (str.charAt(idx)- '1'));
//        f(str,idx+1,output + firstChar);

        if((char) (str.charAt(idx) + str.charAt(idx+1)) <= 'z'){
            char secChar = (char) ('A' + ((str.charAt(idx) + str.charAt(idx+1)) -'1'));
            f(str,idx+2,output+secChar);
        }

    }
    public static void main(String[] args) {
        f("123",0,"");
    }
}
