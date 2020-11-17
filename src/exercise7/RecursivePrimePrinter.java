package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }
public static void printPrimes(int n) {
        // Implement recursive method
        if (n > 0) {
          if (isPrime(n)) {
            System.out.println(n);
          }
          n--;
          printPrimes(n);
        }

    }

    public static boolean isPrime(int n) {
        // Implement method

        boolean prime = true;
        for (int a = n - 1; a > 1; a--) {
          if (n % a == 0) {
            prime = false;
            break;
          }
        }
        return prime;
    }
}
