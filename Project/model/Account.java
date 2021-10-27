package model;

import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Account {

    private String id;
    
    private final DoubleProperty balance = new SimpleDoubleProperty(this, "balance", 1.0);
    private final DoubleProperty interestRate = new SimpleDoubleProperty(this, "interestRate", 2.3);
    
    NumberBinding payout = balance.add((balance.multiply(interestRate)).divide(100));

    public Account() {
        this.id = "c-100";
    }

    public final void setBalance(double balance) {
        if (balance >= 0) {
            this.balance.set(balance);
        } else {
            throw new IllegalArgumentException("Error: balance must be 0 or more.");
        }
    }

    public final double getBalance() {
        return balance.get();
    }

    public final DoubleProperty balanceProperty() {
        return balance;
    }

    public final void setInterestRate(double rate) {
        if (rate >= 0) {
            interestRate.set(rate);
        } else {
            throw new IllegalArgumentException("Error: interest rate must be greater than 0.");
        }
    }

    public final double getInterestRate() {
        return interestRate.get();
    }

    public final DoubleProperty interestRateProperty() {
        return interestRate;
    }

    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Error - ID can't be empty.");
        }
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s Balance: $%.2f \nPayout: $%.2f", id, balance.get(), payout.getValue());
    }
}
