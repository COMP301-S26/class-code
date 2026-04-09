package edu.unc.comp301.decorator.tags;

public class TaxPriceTag implements PriceTag {
    private PriceTag tag;
    private double taxRate;

    public TaxPriceTag(PriceTag tag, double taxRate){
        this.tag = tag;
        this. taxRate = taxRate;
    }

    @Override
    public void setAmount(double amount) {
        this.tag.setAmount(amount);

    }

    @Override
    public double getAmount() {
        return (1+taxRate)* this.tag.getAmount();
    }

    @Override
    public PriceTag unwrap() {
        return tag.unwrap();
    }

    @Override
    public String toString(){
        return String.format("$%.2f", this.getAmount());
    }

}
