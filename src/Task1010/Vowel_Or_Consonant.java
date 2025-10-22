package Task1010;

import java.util.Scanner;

public class Vowel_Or_Consonant {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter : ");
        String input = scanner.next();
        char ch = input.charAt(0);
        if (ch == 'a' || ch =='A' || ch == 'e' || ch =='E' || ch == 'i' || ch =='I' ||
                ch == 'o' || ch == 'O' || ch == 'u' || ch =='U' ) {
            System.out.println(ch + " is Vowel");
        } else {
            System.out.println(ch+ " is Consonant");
        }
    }
}
