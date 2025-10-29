package Task1710;

import java.util.Scanner;

public class Smallest_Of_Two {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int input1 = scanner.nextInt();

        System.out.println("Enter number 2 : ");
        int input2 = scanner.nextInt();

        if(input1<input2)
        {
            System.out.println(input1+" is smaller");
        }
        else
            System.out.println(input2+ " is smaller");
    }
}
