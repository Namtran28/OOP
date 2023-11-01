import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * hi.
     * 
     * @param is - hi.
     */
    public void readCustomerList(InputStream is) {
        try {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            Customer customer = new Customer();
            Account account;
            if (line != null) {
                String name = line.substring(0, line.length() - 10);
                Long id = Long.parseLong(line.substring(name.length() + 1, line.length()));
                customer = new Customer(id, name);
            }
            while ((line = br.readLine()) != null) {
                if (line.charAt(0) >= '0' && line.charAt(0) <= '9') {
                    String[] pair = line.split(" ");
                    long accountNumber = Long.parseLong(pair[0]);
                    double balance = Double.parseDouble(pair[2]);
                    if (pair[1].equals("CHECKING")) {
                        account = new CheckingAccount(accountNumber, balance);
                    } else {
                        account = new SavingsAccount(accountNumber, balance);
                    }
                    customer.addAccount(account);
                } else {
                    customerList.add(customer);
                    String name = line.substring(0, line.length() - 10);
                    String id = line.substring(name.length() + 1, line.length());
                    customer = new Customer(Long.parseLong(id), name);
                }
            }
            customerList.add(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * hi.
     * 
     * @return - hi.
     */
    public String getCustomersInfoByNameOrder() {
        String s = "";
        Collections.sort(customerList, new Comparator<Customer>() {

            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        for (Customer customer : customerList) {
            s += customer.getCustomerInfo();
            s += "\n";
        }
        return s;
    }

    /**
     * hi.
     * 
     * @return - hi.
     */
    public String getCustomersInfoByIdOrder() {
        String s = "";
        Collections.sort(customerList, new Comparator<Customer>() {

            @Override
            public int compare(Customer o1, Customer o2) {
                return (int) (o1.getIdNumber() - o2.getIdNumber());
            }
        });
        for (Customer customer : customerList) {
            s += customer.getCustomerInfo();
            s += "\n";
        }
        return s;
    }

    /**
     * hi.
     * 
     * @return - hi.
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }

    /**
     * hi.
     * 
     * @param args - hi.
     * @throws IOException - hi.
     */
    public static void main(String[] args) throws IOException {
        // InputStream test = new
        // FileInputStream("C:/Users/NAM/Lap_trinh/Java/week9/test.txt");
        // Bank b = new Bank();
        // b.readCustomerList(test);
        // System.out.println(b.getCustomersInfoByIdOrder());
    }
}