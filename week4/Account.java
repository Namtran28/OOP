import java.util.ArrayList;

public class Account {

    private double balance = 0;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * Ham nap tien.
     * 
     * @param amount - So tien muon nap.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
            transitionList.add(new Transaction("deposit", amount, balance));
        }
    }

    /**
     * Ham rut tien.
     * 
     * @param amount - So tien muon rut.
     */
    private void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                transitionList.add(new Transaction("withdraw", amount, balance));
            }
            if (balance < amount) {
                System.out.println("So tien ban rut vuot qua so du!");
            }
        } else {
            System.out.println("So tien ban rut ra khong hop le!");
        }
    }

    /**
     * Ham them mang.
     * 
     * @param amount    - So tien muon rut hoac nap.
     * @param operation - Xem day la giao dichj rut tien hay nap tien.
     */
    public void addTransaction(double amount, String operation) {
        if (operation != Transaction.DEPOSIT && operation != Transaction.WITHDRAW) {
            System.out.println("Yeu cau khong hop le!");
        } else {
            if (operation == Transaction.DEPOSIT) {
                deposit(amount);
            }
            if (operation == Transaction.WITHDRAW) {
                withdraw(amount);
            }
        }
    }

    /**
     * Ham in ra ket qua.
     */
    public void printTransaction() {
        final int n = transitionList.size();
        for (int j = 0; j < n; j++) {
            if (transitionList.get(j).getOperation() == "deposit") {
                System.out.printf("%s %d", "Giao dich", j + 1);
                System.out.printf("%s", ": Nap tien $");
                System.out.printf("%.2f", transitionList.get(j).getAmount());
                System.out.printf("%s", ". So du luc nay: $");
                System.out.printf("%.2f", transitionList.get(j).getBalance());
                System.out.printf("%s\n", ".");
            } else if (transitionList.get(j).getOperation() == "withdraw") {
                System.out.printf("%s %d", "Giao dich", j + 1);
                System.out.printf("%s", ": Rut tien $");
                System.out.printf("%.2f", transitionList.get(j).getAmount());
                System.out.printf("%s", ". So du luc nay: $");
                System.out.printf("%.2f", transitionList.get(j).getBalance());
                System.out.printf("%s\n", ".");
            }
        }
    }

    /**
     * Ham main.
     * 
     * @param args - args.
     */
    public static void main(String[] args) {
        // Account a = new Account();
        // a.addTransaction(2000.255, "deposit");
        // a.addTransaction(3000, "deposit");
        // a.addTransaction(6000, "withdraw");
        // a.printTransaction();
    }
}