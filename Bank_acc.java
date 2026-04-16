import java.util.*;
import java.io.*;

public class Bank_acc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter account number :");
        String account_no = sc.next();
        sc.nextLine(); // clear buffer
        System.out.println("enter your name :");
        String name = sc.nextLine();
        BankAccount obj = new BankAccount();
        while (true) {
            System.out.println("if you want to deposit press d or if you want to withdraw press w");
            String choice = sc.next();

            if (choice.equals("d")) {
                System.out.println("enter the amount you want to deposit :");
                double amount = sc.nextDouble();
                
                obj.deposit(account_no, amount);

            } else if (choice.equals("w")) {
                System.out.println("enter the amount you want to withdraw :");
                double amount = sc.nextDouble();
                
                obj.withdraw(amount);

            }

            System.out.println("if you want to continue press y or if you want to exit press n");
            String cont = sc.next();
            if (cont.equals("n")) {
                break;

            }

        }
    }
}

class BankAccount {
    double balance = 0;

    void deposit(String account_no, double amount) {
        balance = amount + balance;
        System.out.println("your new balance is :" + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Your new balance is: " + balance);
        } else {
            System.out.println("Insufficient balance");
            System.out.println("Current balance is: " + balance);
        }
    }

}
