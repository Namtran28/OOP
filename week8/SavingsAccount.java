public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * hi.
     */
    public void withdraw(double amount) {
        if (amount <= 1000 && balance >= 5000) {
            try {
                Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
                        amount, this.getBalance(), this.getBalance() - amount);
                super.doWithdrawing(amount);
                addTransaction(transaction);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * hi.
     */
    public void deposit(double amount) {
        try {
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
                    amount, this.getBalance(), this.getBalance() + amount);
            super.doDepositing(amount);
            addTransaction(transaction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}