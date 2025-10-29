package Task1710;

import java.util.Scanner;

/*
 Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)

1️⃣ Take user input for marks (Use Scanner class).
2️⃣ Check the validity of marks (ensure they are between 0 and 100).
3️⃣ Use if-else-if conditions to determine the grade based on marks.
4️⃣ Display the grade as output.

Grading Criteria (Example)
Marks Range Grade
90 - 100   A+
80 - 89     A
70 - 79      B
60 - 69     C
50 - 59      D
40 - 49      E
Below 40   Fail
 */
public class Calculate_Grade {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = scanner.nextInt();

        if (marks <= 100 && marks > 0) {
            if (marks <= 100 && marks >= 90)
            {
                System.out.println("A+");
            }
            else if (marks <= 89 && marks >= 80)
            {
                System.out.println("A");
            }
            else if (marks <= 79 && marks >= 70)
            {
                System.out.println("B");
            }
            else if (marks <= 69 && marks >= 60)
            {
                System.out.println("C");
            }
            else if (marks <= 59 && marks >= 50)
            {
                System.out.println("D");
            }
            else if (marks <= 49 && marks >= 40)
            {
                System.out.println("E");
            }
            else if (marks < 40)
            {
                System.out.println("Fail");
            }

        }
        else System.out.println("Enter valid marks");

    }
}
