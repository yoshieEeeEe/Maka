package banking;

import java.util.Scanner;

public class banking {

    int accountNo = 10001;
    String name = "User";
    float initialBalance = 0;
    int pin = 321;

    public boolean verifyAccount(int acc, int pn) {
        return acc == accountNo && pn == pin;
    }

    public int setAccount() {
        return accountNo;
    }

    public void viewBalance() {
        System.out.println("Current Balance: ₱" + initialBalance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        banking account = new banking();

        System.out.print("Enter Account Number: ");
        int acc = scanner.nextInt();

        int attempts = 0;
        boolean verified = false;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int inputPin = scanner.nextInt();

            if (account.verifyAccount(acc, inputPin)) {
                System.out.println("Login successful!");
                account.viewBalance();  // Action after login
                verified = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempt " + attempts + " of 3.\n");
            }
        }

        if (!verified) {
            System.out.println("Too many failed attempts. Access denied.");
        }

        scanner.close();
    }
}
