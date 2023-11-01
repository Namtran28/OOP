public class InvalidFundingAmountException extends BankException {
    public InvalidFundingAmountException(String s) {
        super(s);
    }

    /**
     * hi.
     * 
     * @param amount hi.
     */
    public InvalidFundingAmountException(double amount) {
        super("Số tiền không hợp lệ: "
                + String.format("$%.2f", amount));
    }
}