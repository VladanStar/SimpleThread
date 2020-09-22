package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Runnable zadatak = new PrikazBorojeva(15);
        Thread nit = new Thread(zadatak);

        Runnable zadatak1 = new PrikazTeksta("Vladan Cupric",10);
        Thread nit1 = new Thread(zadatak1);

        Runnable zadatak2 = new PrikazTeksta("Milos Paldon",23);
        Thread nit2 = new Thread(zadatak2);

        long pocetak = System.currentTimeMillis();
        System.out.println(pocetak);

        nit1.start();
        nit.start();
        nit2.start();
        long kraj = System.currentTimeMillis();
        System.out.println(kraj);
        long vremeIzvrsavanja = kraj - pocetak;
        System.out.println("Vreme izvrsavanja " + vremeIzvrsavanja);
    }
}
