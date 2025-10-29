package Task1710;
import java.util.Scanner;

/*
Check if a Triangle is Valid Based on Three Sides.
 */
public class Valid_Triangle {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A - ");
        float a = scanner.nextFloat();
        System.out.println("Enter side B - ");
        float b = scanner.nextFloat();
        System.out.println("Enter side C - ");
        float c = scanner.nextFloat();

        if((a+b>c) && (b+c>a) && (c+a>b))
        {
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Invalid Triangle");
        }
    }
}
