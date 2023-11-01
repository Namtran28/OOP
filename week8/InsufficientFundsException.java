public class InsufficientFundsException extends BankException {
    public InsufficientFundsException(String s) {
        super(s);
    }

    /**
     * hi.
     * 
     * @param amount hi.
     */
    public InsufficientFundsException(double amount) {
        super("Số dư tài khoản không đủ"
                + String.format(" $%.2f để thực hiện giao dịch", amount));
    }
} 