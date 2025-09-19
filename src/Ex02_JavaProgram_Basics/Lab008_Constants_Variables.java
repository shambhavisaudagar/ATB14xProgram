package Ex02_JavaProgram_Basics;

public class Lab008_Constants_Variables {
    public static void main(String[] args) {
    //FINAL
        int a = 10;
        a = 11;
        System.out.println(a);
        final int b = 99;
        //  b = 100; Java can not assign the value to final variable b
        //  final float PI = 3.14f;
        final float a1 = 10;


//DIFFERENT DATA TYPES
        int a2 = 10;
        byte b1 = 10;
        short s = 10;
        long l = 9876543210L;
        float f = 3.14F;
        double d = 87.9876543210;
        boolean b2 = true;
        char c = 'S';
        System.out.printf("%d,%b",a2,b1);
        System.out.println(c);

//MULTIPLE VARIABLES

        int a3 = 10, b3 = 23, c3 = 90;
        int _ = 10, $ = 34;
        System.out.println($);
    }
}
