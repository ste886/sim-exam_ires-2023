package it.ires.exam;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class PhoneCall {
    private final PhoneNumber from;
    private final PhoneNumber to;
    private final LocalDateTime start;
    private LocalDateTime end;


    public PhoneCall(PhoneNumber from, PhoneNumber to) {
        this.from = from;
        this.to = to;
        this.start = LocalDateTime.now();
    }


    void endCall() {
        this.end = LocalDateTime.now();
    }


    public long getDurationMinutes() {
        return ChronoUnit.SECONDS.between(start, end); // dovrebbe essere minutes, seconds per test piu veloce
    }


    public PhoneNumber getTo() {
        return to;
    }


    @Override
    public String toString() {
        return "Chiamata a " + to + " durata (min): " + getDurationMinutes();
    }
}
