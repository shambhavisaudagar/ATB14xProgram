package Task0510;

import java.util.Scanner;

public class Count_Words_In_String {
    static void main() {
        //Count the Number of Words in a String.

        System.out.println("Enter a string of words");
        Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         String split_str[] = input.split(" ");
         int count = 0;
         for(String s:split_str){
             count++;
         }
        System.out.println(count);
    }
}
