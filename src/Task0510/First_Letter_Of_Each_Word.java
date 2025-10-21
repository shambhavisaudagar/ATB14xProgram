package Task0510;

import java.util.Scanner;

public class First_Letter_Of_Each_Word {
    static void main() {
        System.out.println("Enter the string with multiple words");
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();
        String split_str[] = input.split(" ");
        int count = 0;
        for(int i = 0; i<=  split_str.length-1; i++) {
            System.out.println(split_str[i].charAt(0));
        }
    }
}
