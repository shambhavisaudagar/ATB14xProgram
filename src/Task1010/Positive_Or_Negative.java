package Task1010;

import java.util.Scanner;

public class Positive_Or_Negative {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        int input = scanner.nextInt();
        if (input < 0)
        {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }
    }
}
