package Loops;

import java.util.Scanner;

public class spynum {
    public static void main(String[] args) {
        //fascinating
        //strong
        //pronic
        //automorphic
        //perfect
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = inp.nextInt();
        System.out.println(isspy(n));
    }
    public static boolean isspy(int n){
        int sum = 0;
        int prod = 1;
        int s = n;
        int p = n;
        while(s > 0){
            sum += s%10;
            s /= 10;
        }
        while(p > 0){
            prod *= p%10;
            p /= 10;
        }
        if(sum != prod) return false;
        return true;
    }
}
