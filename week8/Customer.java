import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    /**
     * hi.
     */
    public Customer() {

    }

    /**
     * hi.
     * 
     * @param idNumber - hi.
     * @param fullName - hi.
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * hi.
     * 
     * @return hi.
     */
    public String getCustomerInfo() {
        String s = "";
        s += String.format("Số CMND: %d. Họ tên: %s.", idNumber, fullName);
        return s;
    }

    /**
     * hi.
     * 
     * @param account hi.
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * hi.
     * 
     * @param account hi.
     */
    public void removeAccount(Account account) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).equals(account)) {
                accountList.remove(i);
                break;
            }
        }
    }

    /**
     * hi.
     * 
     * @return hi.
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * hi.
     * 
     * @param idNumber hi.
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * hi.
     * 
     * @return hi.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * hi.
     * 
     * @param fullName hi.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * hi.
     * 
     * @return hi.
     */
    public List<Account> getAccountList() {
        return accountList;
    }
}