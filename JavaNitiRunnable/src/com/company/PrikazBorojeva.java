package com.company;

public class PrikazBorojeva implements Runnable{
    private int broj;

    public PrikazBorojeva() {
    }

    public PrikazBorojeva(int broj) {
        this.broj = broj;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    @Override
    public String toString() {
        return "PrikazBorojeva{" +
                "broj=" + broj +
                '}';
    }

    @Override
    public void run() {
        for(int i =1; i<=broj;i++){
            System.out.println(i);
        }
    }
}
