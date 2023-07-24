package it.ires.exam;


import java.util.ArrayList;
import java.util.List;


public class SimCard {
    private final SimPlan plan;
    private final Credit credit;
    private final PhoneNumber number;
    private final List<PhoneCall> calls;


    public SimCard(SimPlan plan, PhoneNumber number) {
        this.plan = plan;
        this.credit = new Credit();
        this.number = number;
        this.calls = new ArrayList<>();
    }


    public boolean canMakeCall() {
        return credit.isPositive();
    }


    public void addPhoneCall(PhoneCall call) {
        this.calls.add(call);
    }


    public void addCredit(double amount) {
        this.credit.addCredit(amount);
    }


    public PhoneNumber getPhoneNumber() {
        return number;
    }


    public List<PhoneCall> getCalls() {
        return calls;
    }


    public void printStatus() {
        System.out.println("Sim: " + number);
        System.out.println("Plan: " + plan);
        System.out.println("Credit: " + credit);
        for (PhoneCall call : calls) {
            System.out.println(" - Call: " + call);
        }
    }
}
