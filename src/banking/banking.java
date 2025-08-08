package banking;

import java.util.ArrayList;
import java.util.Scanner;

public class banking {
    int accountNo;
    String name;
    float initialBalance = 0;
    int pin;

    public banking(int accountNo, int pin) {
        this.accountNo = accountNo;
        this.pin = pin;
        this.name = "User";
    }

    public boolean verifyAccount(int acc, int pn) {
        return acc == accountNo && pn == pin;
    }

    public void viewBalance() {
        System.out.println("Current Balance: ₱" + initialBalance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<banking> registeredAccounts = new ArrayList<>();
        int choice;

        do {
            System.out.print("\nEnter Account Number: ");
            int acc = scanner.nextInt();

            banking matchedAccount = null;

            for (banking b : registeredAccounts) {
                if (b.accountNo == acc) {
                    matchedAccount = b;
                    break;
                }
            }

            if (matchedAccount == null) {
                System.out.print("Set PIN: ");
                int newPin = scanner.nextInt();
                banking newAccount = new banking(acc, newPin);
                registeredAccounts.add(newAccount);
                System.out.println("Account registered!");
            } else {
                int attempts = 0;
                boolean verified = false;

                while (attempts < 3) {
                    System.out.print("Enter PIN: ");
                    int inputPin = scanner.nextInt();

                    if (matchedAccount.verifyAccount(acc, inputPin)) {
                        System.out.println("Login successful!");
                        matchedAccount.viewBalance();
                        verified = true;
                        break;
                    } else {
                        attempts++;
                        System.out.println("Incorrect PIN. Attempt " + attempts + " of 3.");
                    }
                }

                if (!verified) {
                    System.out.println("Too many failed attempts. Access denied.");
                }
            }

            System.out.println("\nDo you wish to continue?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

        } while (choice == 1);

        System.out.println("Program exited.");
        scanner.close();
    }
}
