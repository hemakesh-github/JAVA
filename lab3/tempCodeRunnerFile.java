    SavingsAccount (double balance) {
        savingsBalance = balance;
    }

    static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    double calculateMonthlyInterest() {
        return (savingsBalance + (savingsBalance * annualInterestRate)/12);
    }
}