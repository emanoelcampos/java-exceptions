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
    public boolean withdrawFunds(double amount) {
        //double withdrawFundsWithTax = amount + 0.2;
        amount += 0.2;
        return super.withdrawFunds(amount);
    }

    @Override
    public double getTaxValue() {
        return super.balance * 0.01;
    }
}
