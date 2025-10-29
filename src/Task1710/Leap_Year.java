package Task1710;

import java.util.Scanner;

/*
A year is a leap year if it is divisible by 400.
A year is a leap year if it is divisible by 4 but not by 100.
 */
public class Leap_Year {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = scanner.nextInt();

        if((year%400==0) || ((year%4==0 && year%100!=0)))
        {
            System.out.println(year + " is a Leap year");
        }
        else {
            System.out.println(year + " not a leap year");
        }
        }
    }
