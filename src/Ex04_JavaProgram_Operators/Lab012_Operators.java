package Ex04_JavaProgram_Operators;

public class Lab012_Operators {
    public static void main(String[] args) {
        int age = 60; //assignment operator
        System.out.println(age);

        //Arithmetic operators
        System.out.println("Arithmetic");
        int a = 20;
        int b = 3;
        float c = 3.0f;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/c);
        System.out.println("a+b");
        System.out.println(a+b);

        //Unary Operator
        System.out.println("Unary");
        int ua = +10;
        int ua1 = -110;
        int uresult = ua+ua1;
        System.out.println(uresult);
        int ub = -1;
        ub = ub+10;
        System.out.println(ub);

        //Modulus, Remainder after division
        System.out.println("modulus");
        int mod_a = 20;
        int mod_b = 10;
        System.out.println(mod_a%mod_b); // % is called modulas operator

        //Relational Operator, comparing
        System.out.println("relational");
        int ra = 10;
        int rb = 30;
        boolean rc = ra>rb ;  // 10>30 ;
        System.out.println(rc);
        int age_mamitha = 33;
        int age_pramod = 34;
        boolean rresult = age_pramod>= age_mamitha;
        System.out.println(rresult);


        //logical
        System.out.println("logical");
        boolean la = true;
        System.out.println(!la);
        boolean lb = true;
        System.out.println(!!lb);
        boolean lc = true || false ;
        System.out.println(lc);
        boolean lc1 = false && true;
        System.out.println(lc1);
    }
}
