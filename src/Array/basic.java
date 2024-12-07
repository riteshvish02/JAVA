package Array;

public class basic {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 7, 10, 13, 17, 19, 22, 25};

        System.out.println("Prime numbers in the array:");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        }
        return true; // Prime if no divisors are found
    }


}
