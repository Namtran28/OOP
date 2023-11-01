public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    private int type;
    private double amount;
    private double inttialBalance;
    private double finalBalance;

    /**
     * hi.
     * 
     * @param type           hi.
     * @param amount         hi.
     * @param inttialBalance hi.
     * @param finalBalance   hi.
     */
    public Transaction(int type, double amount, double inttialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.inttialBalance = inttialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * hi.
     * 
     * @param type hi.
     * @return hi.
     */
    private String getTransactionTypeString(int type) {
        String s = "";
        if (type == TYPE_DEPOSIT_CHECKING) {
            s += "Nạp tiền vãng lai";
        } else if (type == TYPE_DEPOSIT_SAVINGS) {
            s += "Nạp tiền tiết kiệm";
        } else if (type == TYPE_WITHDRAW_CHECKING) {
            s += "Rút tiền vãng lai";
        } else if (type == TYPE_WITHDRAW_SAVINGS) {
            s += "Rút tiền tiết kiệm";
        }
        return s;
    }

    /**
     * hi.
     * 
     * @return hi.
     */
    public String getTransactionSummary() {
        String s = "";
        s += String.format("- Kiểu giao dịch: %s. ", getTransactionTypeString(type));
        s += String.format("Số dư ban đầu: $%.2f. ", inttialBalance);
        s += String.format("Số tiền: $%.2f. ", amount);
        s += String.format("Số dư cuối: $%.2f.", finalBalance);
        return s;
    }
}