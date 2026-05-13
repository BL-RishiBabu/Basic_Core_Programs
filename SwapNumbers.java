import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number (b): ");
        int b = sc.nextInt();

        System.out.println("--Before Swap--");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("--After Swap--");
        System.out.println("a = " + a + ", b = " + b);
        
        sc.close();
    }
}