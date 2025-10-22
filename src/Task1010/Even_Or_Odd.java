package Task1010;

import java.util.Scanner;

public class Even_Or_Odd {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = scanner.nextInt();
        if (input % 2 == 0) {
            System.out.println("Even number");
        }
        if (input % 2 != 0) {
            System.out.println("Odd number");
    }

    }
}
