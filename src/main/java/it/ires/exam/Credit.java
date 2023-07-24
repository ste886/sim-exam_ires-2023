package it.ires.exam;


public class Credit {


    private double amount;


    public Credit() {
        this.amount = 0;
    }


    public void addCredit(double amount) {
        this.amount += amount;
    }


    public void bill(double amount) {
        this.amount -= amount;
    }


    public boolean isPositive() {
        return amount > 0;
    }


    @Override
    public String toString() {
        return "Credito residuo (euro): " + amount;
    }
}
