package Task1710;

import java.util.Scanner;

public class Check_Alphabet {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input");
        String str = scanner.next();
        char ch = str.charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
