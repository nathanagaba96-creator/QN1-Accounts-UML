public abstract class Account implements Statement {

    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract boolean withdraw(double amount);

    @Override
    public String generateStatement() {
        return "Account Number: " + accountNumber +
               "\nBalance: UGX " + balance;
    }

    public double getBalance() {
        return balance;
    }
}