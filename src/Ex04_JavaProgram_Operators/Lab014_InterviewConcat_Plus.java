package Ex04_JavaProgram_Operators;

public class Lab014_InterviewConcat_Plus {
    public static void main(String[] args) {
        // + -> arithmetic
        int a=10, b=20;
        System.out.println(a+b);

        // + for string
        String fname = "Shambhavi ", lname = "Saudagar";
        System.out.println(fname+lname);

        // + Operator behaves differently depending on the data type.
        // Called operator overloading

        System.out.println(a+b+fname+lname);  //int string
        System.out.println(fname+lname+a+b); //string string**
        System.out.println(fname+lname+(a+b)); //string int cz of bracs**


    }

}
