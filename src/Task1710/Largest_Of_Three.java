package Task1710;

import java.util.Scanner;

public class Largest_Of_Three {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = scanner.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = scanner.nextInt();

        if(num1 > num2 && num1>num3)
        {
            System.out.println(num1 +" is larger than "+num2+" and "+num3);
        }
        else if(num2 > num1 && num2>num3)
        {
            System.out.println(num2 +" is larger than "+num1+" and "+num3);
        }
        else System.out.println(num3 +" is larger than "+num1+" and "+num2);
    }
}
