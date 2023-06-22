package module5.applying.exceptions.bytebank;

public class TaxCalculator {

    private double totalTax;

    public double getTotalTax() {
        return totalTax;
    }

    public void register(Taxable taxable) {
        double value =  taxable.getTaxValue();
        this.totalTax += value;
    }

}
