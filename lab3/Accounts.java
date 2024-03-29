/*Create class Savings Account. Use a static variable annualInterestRate to store 
the annual interest rate for all account holders. Each object of the class contains 
a private instance variable savingsBalance indicating the amount the saver currently
has on deposit. 

Provide method calculateMonthlyInterest to calculate the monthly interest
by multiplying the savingsBalance by annualInterestRate divided by 12 this interest should 
be added to savings Balance. 

Provide a static method modifyInterestRate that sets the annualInterestRate to a new value. 
Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, 
saver1 and saver2, with balances of $2000.00 and $3000.00, respectively.

Set annualConcentration Rate to 4%, then calculate the monthly interest and print the new balances for
both savers. Then set the annualInterestRate to 5%, calculate the next month’s interest and print the
new balances for both savers. */

class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    SavingsAccount (double balance) {
        savingsBalance = balance;
    }

    static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    double calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate)/12;
        return savingsBalance;
    }
}


class Accounts {
    public static void main(String args[]) {
        SavingsAccount saver1 = new SavingsAccount(4000);
        SavingsAccount saver2 = new SavingsAccount(5000);

        System.out.println("After 1 month");
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Saver 1 balance: $" + saver1.calculateMonthlyInterest());
        System.out.println("Saver 2 balance: $" + saver2.calculateMonthlyInterest());

        System.out.println("After 2 months");
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("Saver 1 balance: $" + saver1.calculateMonthlyInterest());
        System.out.println("Saver 2 balance: $" + saver2.calculateMonthlyInterest());
    }

}