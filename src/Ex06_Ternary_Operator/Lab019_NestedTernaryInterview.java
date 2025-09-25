package Ex06_Ternary_Operator;

public class Lab019_NestedTernaryInterview {
    public static void main(String[] args) {

        System.out.println("Ternary nested for age example ");
        int age = 18;
        String result = (age>18) ? (age >25?"He can drink":"Only party no drinking" ): "Dont go to Goa with friends";
        System.out.println(result);

        System.out.println("\nPrint max of 2 numbers");
        int x =10;
        int y= 20;
        System.out.println(Math.max(x,y)); // Single line math function
        int max = x > y ? x : y;
        System.out.println(max);

    }

}
