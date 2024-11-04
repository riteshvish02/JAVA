package Sherr;

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = inp.nextInt();
        System.out.println(isStrong(num));
    }
    public static Boolean isStrong(int n){
        int sum = 0;
        int check = n;
        while(n > 0){
            int rem = n%10;
            int fac = fac(rem);
            sum += fac;
            n = n/10;
        }
        Boolean bool = check == sum ? true:false;
        return bool;
    }
    public static int fac(int n ){
        int result = 1;
        for(int i = 1; i <= n;i++){
            result = result * i;
        }
        return  result;
    }
}
