package edu.unc.comp301.decorator.tags;

public class PriceTagImpl implements PriceTag{
    private double amount;

    public PriceTagImpl(double amount){
        this.amount = amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public PriceTag unwrap() {
        return this;
    }
}
