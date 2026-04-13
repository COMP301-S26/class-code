package edu.unc.comp301.decorator.tags;

public class DiscountedPriceTag implements PriceTag {
    private PriceTag tag;
    private double discount;

    public DiscountedPriceTag(PriceTag tag, double discount){
        this.tag = tag;
        this.discount = discount;
    }

    @Override
    public void setAmount(double amount) {
        tag.setAmount(amount);
    }

    @Override
    public double getAmount() {
        return tag.getAmount() * (1-discount) ;
    }

    public PriceTag unwrap(){
        return tag.unwrap();
    }
}
