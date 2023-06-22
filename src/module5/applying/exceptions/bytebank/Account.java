package module5.applying.exceptions.bytebank;

public abstract class Account {

    protected double balance;
    private int branchNumber;
    private int accountNumber;
    private Client accountHolder;

    private static int total;

    public Account(int branchNumber, int accountNumber) {
        Account.total++;
        this.branchNumber = branchNumber;
        this.accountNumber = accountNumber;
    }

    public static int getTotal() {
        return Account.total;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Client getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Client accountHolder) {
        this.accountHolder = accountHolder;
    }

    public abstract void depositFunds(double amount);

    public boolean withdrawFunds(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferFunds(Account destinationAccount, double amount) {
        if(this.withdrawFunds(amount)) {
            destinationAccount.depositFunds(amount);
            return true;
        }
        return false;
    }
}
