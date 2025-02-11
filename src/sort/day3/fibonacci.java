package sort.day3;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int n = 5;
        for(int i = 0; i <= n ; i++){
            System.out.println(c + " " + i);
            c = a + b;
            a = b;
            b = c;
        }
    }

}
