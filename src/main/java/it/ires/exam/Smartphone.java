package it.ires.exam;


public class Smartphone {
    private final SimCard sim;
    private PhoneCall currentCall;


    public Smartphone(SimCard sim) {
        this.sim = sim;
    }


    public void startCall(PhoneNumber to) {
        if (sim.canMakeCall() && currentCall == null) {
            System.out.println("Chiamo " + to);
            currentCall = new PhoneCall(sim.getPhoneNumber(), to);
        } else {
            System.out.println("Una chiamata è già in corso.");
        }
    }


    public void endCall() {
        this.currentCall.endCall();
        sim.addPhoneCall(this.currentCall);
        this.currentCall = null;
    }


    public long getTotalCallTime() {
        long total = 0;
        for (PhoneCall call : sim.getCalls()) {
            total += call.getDurationMinutes();
        }
        return total;
    }


    public long getTotalCallTime(PhoneNumber to) {
        long total = 0;
        for (PhoneCall call : sim.getCalls()) {
            if (call.getTo().equals(to)) {
                total += call.getDurationMinutes();
            }
        }
        return total;
    }


    public void printSimStatus() {
        sim.printStatus();
    }






}
