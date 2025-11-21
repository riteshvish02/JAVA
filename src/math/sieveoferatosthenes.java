package math;

import java.util.Arrays;
import java.util.Scanner;

public class sieveoferatosthenes {
    public static void main(String[] args) {
//        Sieve of Eratosthenes ek algorithm hai jisme hum 2 se leke n-1
//        tak ke numbers me se non-primes ko filter (mark) karte hain.
        //for example countprimes,uglynumber etc;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Number ");
        int num = inp.nextInt();
        inp.close();
        if(num <= 2) return;
        boolean[] isPrimes = new boolean[num];
        Arrays.fill(isPrimes,true);
        isPrimes[0] = false;
        isPrimes[1] = false;
        for(int i = 2; i*i < num;i++){
            for(int j = i*i;j < num; j+=i){
                isPrimes[j]  = false;
            }
        }
        int count = 0;
        for(boolean isprime : isPrimes){
            if(isprime)count++;
        }
        System.out.println(count);
    }
}
