package Ex03_JavaProgram_Literals;

public class Lab010_Character_Literals {
    public static void main(String[] args) {
        char C1 = 'A'; // A-z, a-z, !@#$%^&*()
        // char = "A";  "" == string a bunch of character
        char C2 = 'B';
        char C3 = '@';
        char C4 =  '_';
        char C5 =  '9';
        char C6 = '1';
        char C7 =  '(';
        char C8 =  ' '; // blank space
        // Escape sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';
        System.out.println("Shambhavi Saudagar");
        System.out.println("Shambhavi"+new_line+"Saudagar");
        System.out.println("Shambhavi\nSaudagar");
        System.out.println("Shambhavi"+tab_line+"Saudagar");
        System.out.println("Shambhavi"+back_space+"Saudagar");
        System.out.println("--------");
        // back space delete 1 character
        System.out.println("Hi, This is First line"+new_line+"This is Second line \n This is Third line");

        char C10 = 'A';
        // ASCII , (Limited Numbers) - A to 65
        char rupees = '₹';
        System.out.println(rupees);
        char my_char = '\u1f70'; // :)
        System.out.println(my_char);
        char C11 = '\u1F80';
    }
}
