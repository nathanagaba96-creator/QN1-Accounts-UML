public class Main {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount("S001", 1000, 5);

        CurrentAccount current =
                new CurrentAccount("C001", 500, 1000);

        savings.deposit(500);
        savings.withdraw(300);
        savings.addInterest();
        current.withdraw(1200);
        Customer customer = new Customer("Nathan");

        customer.addAccount(savings);
        customer.addAccount(current);
        System.out.println(savings.generateStatement());

        System.out.println();
        System.out.println(current.generateStatement());

        System.out.println();
        System.out.println("Customer Total Worth: UGX "
                + customer.totalWorth());
    }
}