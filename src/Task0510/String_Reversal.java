package Task0510;
import java.io.InputStream;
import java.util.Scanner;

public class String_Reversal {
    static void main() {
        //Write a program to reverse a string without using inbuilt functions.
        System.out.println("Enter String to be reversed : ");
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    int i;
        String reverse="";
        for(i= input.length()-1;i>=0;i--)
        {
            reverse=reverse+input.charAt(i);
        }
        System.out.println(reverse);
    }
}
