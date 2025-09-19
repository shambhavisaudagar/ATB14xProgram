package Ex02_JavaProgram_Basics;

public class Lab007_printf {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);

        System.out.print(a);
        System.out.println();
        System.out.print(b);
        System.out.println();

        System.out.printf("Value of a = %d\n", a);
        System.out.printf("Value of b = %d", b);
    }
}
