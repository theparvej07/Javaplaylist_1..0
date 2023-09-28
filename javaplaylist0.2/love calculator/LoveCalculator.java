import java.util.Scanner;

public class LoveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String firstName = scanner.nextLine().toLowerCase();
        System.out.println("Enter the second name:");
        String secondName = scanner.nextLine().toLowerCase();

        int commonLetters = 0;
        for (char c : firstName.toCharArray()) {
            if (secondName.indexOf(c) != -1) {
                commonLetters++;
            }
        }

        int totalLetters = firstName.length() + secondName.length();
        int lovePercentage = (commonLetters * 100) / totalLetters;

        System.out.println("The love percentage is: " + lovePercentage + "%");
    }
}
