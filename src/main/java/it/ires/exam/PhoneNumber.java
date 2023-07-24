package it.ires.exam;


public class PhoneNumber {
    private final String prefix;
    private final String number;


    public PhoneNumber(String prefix, String number) {
        this.prefix = prefix;
        this.number = number;
    }


    public boolean isValid() {
        return true;
    }


    @Override
    public String toString() {
        return "(" + prefix + ") " + number;
    }
}
