package entities;

public class BanckAccount {
    private int accountNumber;
    private String name;
    private double bankBalance;


    public BanckAccount() {

    }

    public BanckAccount(int accountNumber, String name, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        depositAccount(initialDeposit);
    }

    public BanckAccount(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void depositAccount(double deposit) {
        bankBalance += deposit;
    }

    public void withdrawAccount(double deposit) {
        bankBalance -= deposit + 5.0;
    }


    @Override
    public String toString() {
        return "Account "
                + accountNumber
                + ", holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", bankBalance);

    }
}
