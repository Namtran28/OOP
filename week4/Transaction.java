public class Transaction {

    private String operation;
    private double amount;
    private double balance = 0;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * Khoi tao 3 tham so.
     * 
     * @param operation - operation.
     * @param amount    - amount.
     * @param balance   - balance.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Getter of operation.
     * 
     * @return - Tra ve operation.
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Getter of amount.
     * 
     * @return - Tra ve amount.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Getter of balance.
     * 
     * @return - Tra ve balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Setter of operation.
     * 
     * @param operation - operation.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Setter of amount.
     * 
     * @param amount - amount.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Setter of balance.
     * 
     * @param balance - balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}