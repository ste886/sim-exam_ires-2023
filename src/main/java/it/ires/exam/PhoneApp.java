package it.ires.exam;


import java.util.Random;


public class PhoneApp {


  public static void main(String[] args) throws InterruptedException {
    SimPlan plan = new SimPlan(0.20); // 20 cents per minuto
    PhoneNumber number = new PhoneNumber("+39", "1238574");
    SimCard sim = new SimCard(plan, number);
    Smartphone smartphone = new Smartphone(sim);


    PhoneNumber pippo = new PhoneNumber("+39", "123");
    PhoneNumber pluto = new PhoneNumber("+39", "456");
    PhoneNumber paperino = new PhoneNumber("+39", "789");


    smartphone.startCall(pippo); // no credito
    sim.addCredit(1.00);
    smartphone.startCall(pippo);
    smartphone.startCall(pluto); // error
    Thread.sleep(1000);
    smartphone.endCall();




    Random r = new Random();


    for (int i = 0; i < r.nextInt(10); i++) {
      smartphone.startCall(pippo);
      Thread.sleep(r.nextInt(10)*1000);
      smartphone.endCall();
    }
    for (int i = 0; i < r.nextInt(10); i++) {
      smartphone.startCall(pluto);
      Thread.sleep(r.nextInt(10)*1000);
      smartphone.endCall();
    }
    for (int i = 0; i < r.nextInt(10); i++) {
      smartphone.startCall(paperino);
      Thread.sleep(r.nextInt(10)*1000);
      smartphone.endCall();
    }


    System.out.println("Minuti totali: " + smartphone.getTotalCallTime());
    System.out.println("Minuti pippo: " + smartphone.getTotalCallTime(pippo));
    smartphone.printSimStatus();




  }

}
