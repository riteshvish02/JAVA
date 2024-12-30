package Recursion;

public class question4 {
    public static void f(String str,int idx,String output){
        if(idx == str.length()){
            System.out.println(output);
            return;
        }

        char firstChar = (char) ('A' + (str.charAt(idx)- '1'));
        f(str,idx+1,output + firstChar);
        if(idx+1 < str.length()){
            int twodigitnumber = Integer.parseInt(str.substring(idx,idx+2));
            if(twodigitnumber <= 26 && twodigitnumber >= 10 ){
                char twochar = (char) ('A' + (twodigitnumber - 1));
                f(str,idx+2,output + twochar);
            }
        }


    }
    public static void main(String[] args) {
        f("25114",0,"");
    }
}
