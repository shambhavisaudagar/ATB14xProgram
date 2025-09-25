package Ex05_JavaProgram_TypeCasting;

public class Lab024_Type_cating {

    public static void main(String[] args) {
        byte b = 10;
        // int a = b; // valid syntax - Implicit - widening
        int a = (int) b; // Explicit - widening
        int a1 = 300;
        //  byte b1= a1;  Not possible


        byte b1 = 10;
        int ab = b1; // valid syntax -> widening - Implicit Casting - Automatically done
        int a2 = (int) b1 ; // explicit -> widening - Implicit Casting -> not required
    }
}
