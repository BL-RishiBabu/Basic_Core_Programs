import java.util.Random;
import java.util.Scanner;

class FlipTheCoin {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of time to flip the coin : ");
        int numberOfFlips = sc.nextInt();

        if (numberOfFlips <= 0) {
            System.out.println("Enter Positive number");
            return;
        }

        int headCount = 0, tailCount = 0;

        for (int i = 1; i <= numberOfFlips; i++) {
            int toseResult = random.nextInt(2);
            if (toseResult == 1) headCount += 1;
            else if (toseResult == 0) tailCount += 1;
        }

        System.out.println("Head : " + headCount);
        System.out.println("Tail : " + tailCount);

        double headResult = (headCount / (double) numberOfFlips) * 100;
        double tailResult = (tailCount / (double) numberOfFlips) * 100;
        
        System.out.println("Head Percentage : " + headResult + "%");
        System.out.println("Tail Percentage : " + tailResult + "%");
    }
}