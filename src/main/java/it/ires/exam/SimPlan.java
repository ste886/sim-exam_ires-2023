package it.ires.exam;


public class SimPlan {
    private final double callRate;


    public SimPlan(double callRate) {
        this.callRate = callRate;
    }


    public double getCallRate() {
        return callRate;
    }


    @Override
    public String toString() {
        return "Piano eur/min: " + callRate;
    }
}
