package Task1010;

import java.util.Scanner;

public class Age_Check {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = scanner.nextInt();
        if (age< 18)
        {
            System.out.println("You are not eligible to vote");
        } else {
            System.out.println("You are eligible for voting");

        }
    }
}
