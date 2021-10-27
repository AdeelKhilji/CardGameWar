package model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Wallet {
     
    private final DoubleProperty amount = new SimpleDoubleProperty(this, "amount");
     
    public Wallet() {}
     
    public void setAmount(double amt) {
        amount.set(amt);
    }
     
    public double getAmount() {
        return amount.get();
    }
     
    public DoubleProperty amountProperty() {
        return amount;
    }
     
    public void adjustAmount(double amt) throws Exception {
 
        double currentAmt = amount.get();
 
        // negative amounts for taking money out        
        // check if a neg'v amt to take out is too much
        if (amt < 0 && -amt > currentAmt) 
            throw new Exception("Not enough money in your wallet!");
 
        amount.set(currentAmt + amt);
    }
     
}