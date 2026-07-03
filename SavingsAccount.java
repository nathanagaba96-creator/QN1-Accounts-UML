public class SavingsAccount extends Account {

    private double rate;

    public SavingsAccount(String accountNumber,
                          double balance,
                          double rate) {

        super(accountNumber, balance);
        this.rate = rate;
    }

    @Override
    public boolean withdraw(double amount) {

        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public void addInterest() {

        balance += balance * rate / 100;
    }
}