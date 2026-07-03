import java.util.ArrayList;
public class Customer {
    private String customerName;
    private ArrayList<Account> accounts;
    public Customer(String customerName) {
        this.customerName = customerName;
        accounts = new ArrayList<>();
    }
    public String getCustomerName() {
        return customerName;
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public double totalWorth() {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
}