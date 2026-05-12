import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit year: ");
        int year = sc.nextInt();

        if (year < 1000 || year > 9999) {
            System.out.println("Invalid Input. Please enter a year between 1000 and 9999.");
        } else {
            boolean isLeap = false;

            if (year % 400 == 0) isLeap = true;
            else if (year % 4 == 0 && year % 100 != 0) isLeap = true;

            System.out.println(year + " is " + (isLeap ? "" : "not ") + "a Leap Year.");
        }
        
        sc.close();
    }
}