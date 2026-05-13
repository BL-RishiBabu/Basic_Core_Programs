import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largestNumber;

        System.out.println("*** Enter Three Numbers ***");
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();

        if (a > b) {
            largestNumber = a > c ? a : c;
        } else {
            largestNumber = b > c ? b : c;
        }

        System.out.println("The largest number among " + a + ", " + b +" and " + c + " is " + largestNumber);
        sc.close();
    }
}
