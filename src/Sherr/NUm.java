package Sherr;

import java.util.Scanner;

public class NUm {
    public static void main(String[] args) {
        // pallindrome of a number
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int num = inp.nextInt();
        System.out.println(check(num));
    }
    public static Boolean check(int n ){
        int rev = 0;
        int check = n;
        while(n > 0){
            int rem = n%10;
             rev = 10 * rev + rem;
             n = n/10;
        }
        Boolean ans = check == rev ?true:false;
        return ans;

    }
}
