package string;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner inp =  new Scanner(System.in);
        String val = inp.next();
        System.out.println(checkpalindrome(val));
    }
    public static Boolean checkpalindrome(String val){
        int i = 0;
        int j = val.length() - 1;
        while(i < j){
            if (val.charAt(i) != val.charAt(j)) {

                return false;
            }
            i++;
            j--;
        }
        return  true;
    }
}
