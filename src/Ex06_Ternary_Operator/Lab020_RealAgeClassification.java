package Ex06_Ternary_Operator;

public class Lab020_RealAgeClassification {
    public static void main(String[] args) {
        String user_input = args[0]; // 68
        System.out.println(user_input);
        // String - Int
        System.out.println(user_input instanceof String);
        // Input - String
        int age  = Integer.parseInt(user_input);
        String result = (age < 18) ? "Minor" : (age <= 60 )  ? "Adult" : "Sr.Citizen";
        System.out.println(result);

    }
}
