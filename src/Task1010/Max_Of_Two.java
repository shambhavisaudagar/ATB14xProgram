package Task1010;

import java.util.Scanner;

public class Max_Of_Two {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input 1 : ");
        int input1 = scanner.nextInt();
        System.out.println("Enter input 2 : ");
        int input2 = scanner.nextInt();

        if(input1 >input2)
        {
            System.out.println(input1 + " is bigger than "+input2);
        } else if (input1==input2) {
            System.out.println(input1 + " and "+input2+ " are equal");

        } else
            System.out.println(input2 + " is bigger than "+input1);

    }
}
