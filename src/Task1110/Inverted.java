package Task1110;
/*
 *****
 ****
 ***
 **
 *
 */


public class Inverted {
    static void main() {
        for (int i = 5; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
