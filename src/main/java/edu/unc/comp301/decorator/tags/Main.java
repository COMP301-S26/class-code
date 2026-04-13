package edu.unc.comp301.decorator.tags;

public class Main {
    public static void main(String[] args) {
        PriceTag tag = new PriceTagImpl(100);//Nice keyboard
        tag = new DiscountedPriceTag(tag, .2);
        tag = new DiscountedPriceTag(tag, .2);
        tag = new DiscountedPriceTag(tag, .2);
        tag = new DiscountedPriceTag(tag, .2);
        tag = new DiscountedPriceTag(tag, .2);

        System.out.println(tag.unwrap().getAmount());

    }
}
