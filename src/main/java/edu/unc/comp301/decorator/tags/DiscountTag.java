package edu.unc.comp301.decorator.tags;

public class DiscountTag implements PriceTag{
    private PriceTag tag;
    private double discount;

    public DiscountTag(PriceTag tag, double discount){
        this.tag = tag;
        this.discount = discount;
    }

    @Override
    public void setAmount(double amount) {
        tag.setAmount(amount);
    }

    @Override
    public double getAmount() {
        return Math.max(0,tag.getAmount()-discount);
    }

    @Override
    public String toString(){
        return String.format("$%.2f", this.getAmount());
    }

    public PriceTag unwrap(){
        return this.tag;
    }
}
