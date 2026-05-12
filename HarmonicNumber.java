import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Harmonic Value N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Error: N must be a positive integer greater than 0.");
        } else {
            double harmonicValue = 0.0;

            for (int i = 1; i <= N; i++) {
                harmonicValue += (1.0 / i);
                System.out.print("1/" + i + (i < N ? " + " : ""));
            }

            System.out.println("\n\nThe " + N + "th Harmonic Value is: " + harmonicValue);
        }

        sc.close();
    }
}