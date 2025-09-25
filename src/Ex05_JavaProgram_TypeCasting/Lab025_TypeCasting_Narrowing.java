package Ex05_JavaProgram_TypeCasting;

public class Lab025_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val; // Ex - bigger basket to small basket
        // Narrowing - Implicit casting - is this valid - NO
        byte b = (byte) val; // Narrowing - Explicit casting - valid

        long phone_no = 987465123;
        // short s = phone_no; // Narrowing Implicit is not possible
        short s= (short) phone_no; // Narrowing Explicit is possible
        System.out.println(s);


    }
}
