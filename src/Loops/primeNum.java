package Loops;

import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        //print first n prime numers
        //print nth prime num
        //count the num of prime num in array
        //print the index in an array where prime num is present
        //count the num of prime num bw two given nums
        //print all prime nums upto n

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = inp.nextInt();
        System.out.println(isprime(n));
    }
    public static boolean isprime(int n){
        if(n <= 1) return false;
        for(int i = 2; i<= Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
