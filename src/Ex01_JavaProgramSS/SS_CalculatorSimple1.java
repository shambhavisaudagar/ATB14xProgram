package Ex01_JavaProgramSS;
/*Create a simple calculator that performs basic arithmetic operations (+, -, *, /) on two numbers.

Input Format: Two numbers and an operator (+, -, *, /)
Output Format: Result of the operation*/

import java.util.Scanner;

public class SS_CalculatorSimple1 {
    public static void main(String[] args) {
       /* int a=10;
        int b=2;
        int c=5;
        int add=a+b;
        int minus=a-b;
        int mult=a*b;
        int div=a/c;
        System.out.println("Addition -> 10+2 = "+ add);
        System.out.println("Subtraction -> 10-2 = "+ minus);
        System.out.println("Multiplication -> 10*2 = "+ mult);
        System.out.println("Division -> 10/5 = "+ div); */    //Fixed values in the program

        Scanner scanner = new Scanner(System.in);
        // Read two numbers and an operator
        // Perform the calculation and print result
        System.out.println("Enter first number");

        double fnumb = scanner.nextDouble();  // Read user input
        System.out.println("Enter second number");
        double snumb = scanner.nextDouble();
        System.out.println("Enter the operator");
        String op = scanner.next();
        double result;
        switch(op){
            case "+" :{
                        result = fnumb + snumb;
                        System.out.println("Result is " +fnumb+ "+" +snumb+ "=" +result);
                        break;
                        }
            case "-" :{
                        result = fnumb - snumb;
                        System.out.println("Result is " +fnumb+ "-" +snumb+ "=" +result);
                        break;
                        }
            case "*" :{
                        result = fnumb * snumb;
                        System.out.println("Result is " +fnumb+ "*" +snumb+ "=" +result);
                        break;
                        }
            case "/" : {
                        result = fnumb / snumb;
                        System.out.println("Result is " +fnumb+ "/" +snumb+ "=" +result);
                        break;
                        }

            case " ":
                System.out.println("incorrect inputs");

        }
        scanner.close();
    }
}