import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character : ");
        char letter = sc.next().toLowerCase().charAt(0);

        boolean condition = letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
        System.out.println("Letter " + letter + " is a " + (condition ? "Vowel" : "Consonant"));

        sc.close();
    }
}
