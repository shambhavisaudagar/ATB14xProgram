package Ex07_Increment_DecrementOp;

public class Lab022_IncrementOp {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("\n After increment");
        int a1 = 10;
        System.out.println(++a1);
        // Post Increment
        int a_post = 10;
        int b1 = a_post++;
        System.out.println(a_post);
        System.out.println(b1);

        System.out.println("\n ++a");
        int a2 = 10;
        int a2_result = ++a2;
        System.out.println(a2_result);

        System.out.println("\n a3++");
        int a3 = 10;
        int resulta3 = a3++;
        System.out.println(a3);
        System.out.println(resulta3);

        System.out.println("\n a4++ +a4");
        int a4 = 10;
        System.out.println(a4++ +a4);

        System.out.println("\n a5++ + ++a5");
        int a5 = 10;
        System.out.println(a5++ +  ++a5);
        System.out.println(a5);

        System.out.println("\n++a6 + ++a6");
        int a6 = 10;
        System.out.println(++a6 + ++a6);
        System.out.println(a6);
    }
}
