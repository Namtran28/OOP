public class CheckingAccount extends Account {
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * hi.
     */
    public void withdraw(double amount) {
        try {
            Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_CHECKING,
                    amount, this.getBalance(), this.getBalance() - amount);
            super.doWithdrawing(amount);
            addTransaction(transaction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * hi.
     */
    public void deposit(double amount) {
        try {
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_CHECKING,
                    amount, this.getBalance(), this.getBalance() + amount);
            super.doDepositing(amount);
            addTransaction(transaction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}