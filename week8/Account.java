import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";

    protected long accountNumber;
    protected double balance;

    protected List<Transaction> transactionList = new ArrayList<>();

    /**
     * hi.
     */
    public Account() {

    }

    /**
     * hi.
     * 
     * @param accountNumber - hi.
     * @param balance       - hi.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * hi.
     * 
     * @return - hi.
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * hi.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * hi.
     * 
     * @param amount - hi.
     * @throws BankException - hi.
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > balance) {
            throw new InsufficientFundsException(amount);
        } else {
            balance -= amount;
        }
    }

    /**
     * hi.
     * 
     * @param amount - hi.
     * @throws BankException - hi.
     */
    public void doDepositing(double amount) throws BankException {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new InvalidFundingAmountException(amount);
        }
    }

    /**
     * hi.
     * 
     * @param amount - hi.
     */
    public abstract void withdraw(double amount);

    /**
     * hi.
     * 
     * @param amount - hi.
     */
    public abstract void deposit(double amount);

    /**
     * hi.
     * 
     * @return - hi.
     */
    public String getTransactionHistory() {
        String s = "";
        s += String.format("Lịch sử giao dịch của tài khoản %d:\n", accountNumber);
        for (Transaction transaction : transactionList) {
            s += transaction.getTransactionSummary() + "\n";
        }
        return s;
    }

    /**
     * hi.
     * 
     * @param transaction - hi.
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * hi.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Account other = (Account) obj;
        if (accountNumber != other.accountNumber) {
            return false;
        }
        return true;
    }
}