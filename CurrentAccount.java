public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(String accountNumber,
                          double balance,
                          double overdraftLimit) {

        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {

        if (balance - amount >= -overdraftLimit) {

            balance -= amount;

            return true;
        }

        return false;
    }
}