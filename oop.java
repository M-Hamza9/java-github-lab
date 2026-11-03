import java.util.Scanner;

class BankAccount {
    int accountno;
    String accountHolder;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>=0){
            this.balance = balance;
        }else{
            System.out.println("Invalid Balance:");
        }
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Amount:");
        } else {
            balance += amount;
            System.out.println("Total Balance:"+ balance);
        }
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient amount:");
        } else {
            balance -= amount;
            System.out.println("WitHDrawn Amount:" + amount);
            System.out.println("Remaining balance:" + balance);
        }
    }
}

public class oop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount B = new BankAccount();
        B.setBalance(1000);
        B.accountHolder="HAMZA";
        B.accountno=123;

        B.withdraw(500);
        System.out.println("Enter Amount you want to Deposit:");
        double amount = sc.nextDouble();
        B.deposit(amount);

    }
}
