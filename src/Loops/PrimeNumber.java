package Loops;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int div = 2;
        int flag = 0;
        while(div <= n-1){
            if(n%div == 0){
              flag = 1;
              break;
            }
            div += 1;

        }
        if(flag == 1) {
            System.out.println("Not a prime number");
        }else{
                System.out.println("yes its a prime number");
        }

    }
}
