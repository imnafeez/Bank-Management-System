import java.util.Scanner;

public class Main {

    static int balance = 5000;

    static void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amt = sc.nextInt();

        balance += amt;
        System.out.println("After Deposit: " + balance);
    }

    static void withdraw() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amt = sc.nextInt();

        if (amt <= balance) {
            balance -= amt;
            System.out.println("After Withdrawal: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    static void showBalance() {
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Balance");
            System.out.println("4.Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if (choice == 1)
                deposit();
            else if (choice == 2)
                withdraw();
            else if (choice == 3)
                showBalance();
            else if (choice == 4)
                break;
            else
                System.out.println("Invalid Choice");
        }
    }
}
