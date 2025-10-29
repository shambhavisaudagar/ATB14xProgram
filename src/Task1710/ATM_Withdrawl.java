package Task1710;

import java.util.Scanner;

/*

ATM Withdrawal Simulation. (Follow Below Steps to Write Program)

       Steps to Write the Program

1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
2️⃣ Take user input for the amount they want to withdraw.
3️⃣ Check withdrawal conditions:
The amount should be greater than zero.
The amount should be a multiple of 100 (common ATM rule).
The amount should not exceed the account balance.
4️⃣ Deduct the amount from the balance if conditions are met.
5️⃣ Display the updated balance or an error message if the withdrawal fails.
 */
public class ATM_Withdrawl {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw-");

        double bal = 2500000;
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else if (amount % 100 != 0) {
            System.out.println("Amount must be multiple of 100");
        } else if (amount > bal) {
            System.out.println("Insufficient Bal");
        } else {
            bal -= amount;
            System.out.println("Withdraw successful!! Remaining Bal " +bal);
        }
    }
}
