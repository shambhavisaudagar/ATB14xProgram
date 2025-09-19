package Ex03_JavaProgram_Literals;

public class Lab009_Literals {
    public static void main(String[] args) {
        int age = 65;
        // Literal - Integral
        final float pi = 3.14f;
        // Literal - float
        final int  girl_age = 18;
        // girl_age = 19;
        System.out.println(girl_age);

        //Float literal
        float pi1 = 3.14f;
        float pi2 = 3.14F;
        float x = 10.00f;
        System.out.println(pi2);

        //Boolean literal
        boolean is_married = true;
        boolean is_married_amit = false;
        System.out.println(is_married);
        // boolean is_married_amit = 123;

        int Enum = 9; // enum is Keyword
        System.out.println(Enum);

        int age_sc = 60;  // Decimal system base will 10
        System.out.println(age_sc);
        // Binary Literal
        int binary_num = 0b1101; // Decimal system  - 10 , Binary system
        System.out.println(binary_num);
        int octal = 0101;
        System.out.println(octal);
        // octal system ? - 8
        int hex = 0xface;
        System.out.println(hex);
        // Hecadecimal Literals - 16
        // base 16 color combination are in hex - #28a645
    }
}
