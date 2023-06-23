package module5.applying.exceptions.bytebank;

public class CurrentAccount extends Account implements Taxable{

    public CurrentAccount(int branchNumber, int accountNumber) {
        super(branchNumber, accountNumber);
    }

    @Override
    public void depositFunds(double amount) {
       super.balance =+ amount;
    }

    @Override
    public void withdrawFunds(double amount) throws InsufficientFundsException{
        amount += 0.2;
        super.withdrawFunds(amount);
    }

    @Override
    public double getTaxValue() {
        return super.balance * 0.01;
    }
}
