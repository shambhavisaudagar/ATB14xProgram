package Ex05_JavaProgram_TypeCasting;

public class Lab026_TypeCasting_Used {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val; Narrowing Implicit is not possible
        byte b = (byte) val; // Narrowing Explicit is possible
        System.out.println(b);

        int course = 100;
        float GST = 18.45f;
        //   int total1 = course+GST; // Narrowing Implicit
        int total = course+(int)GST; // Narrwoing Explicit
        System.out.println(total);
        float total2 = course+GST; // Narrowing Implicit , widening - auto- implicit
        //float total3 = (float) course+GST; // widening Explicit
        System.out.println(total2);


    }
}
