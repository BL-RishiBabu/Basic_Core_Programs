import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to find its prime factors: ");
        if (sc.hasNextLong()) {
            long n = sc.nextLong();
            System.out.print("Prime factors of " + n + " are: ");
            findPrimeFactors(n);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        sc.close();
    }

    public static void findPrimeFactors(long n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }
        System.out.println();
    }
}