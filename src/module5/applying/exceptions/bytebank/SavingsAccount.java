package module5.applying.exceptions.bytebank;

public class SavingsAccount extends Account {

    public SavingsAccount(int branchNumber, int accountNumber) {
        super(branchNumber, accountNumber);
    }

    @Override
    public void depositFunds(double amount) {
        super.balance += amount;
    }
}
