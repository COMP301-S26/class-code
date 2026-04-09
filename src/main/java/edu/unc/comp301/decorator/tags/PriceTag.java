package edu.unc.comp301.decorator.tags;

public interface PriceTag {
    void setAmount(double amount);
    double getAmount();
    PriceTag unwrap();
}