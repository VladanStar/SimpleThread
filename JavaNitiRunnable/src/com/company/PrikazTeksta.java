package com.company;

public class PrikazTeksta implements Runnable {

    private String tekst;
    private int brojPonavljanja;

    public PrikazTeksta() {
    }

    public PrikazTeksta(String tekst, int brojPonavljanja) {
        this.tekst = tekst;
        this.brojPonavljanja = brojPonavljanja;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public int getBrojPonavljanja() {
        return brojPonavljanja;
    }

    public void setBrojPonavljanja(int brojPonavljanja) {
        this.brojPonavljanja = brojPonavljanja;
    }

    @Override
    public String toString() {
        return "PrikazTeksta{" +
                "tekst='" + tekst + '\'' +
                ", brojPonavljanja=" + brojPonavljanja +
                '}';
    }

    @Override
    public void run() {
        for(int i = 0; i<brojPonavljanja; i++){
            System.out.println(tekst);
        }
    }
}
