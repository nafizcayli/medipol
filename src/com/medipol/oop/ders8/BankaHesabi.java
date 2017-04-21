package com.medipol.oop.ders8;

public class BankaHesabi {
    private Kisi kisi;
    private double bakiye;

    public BankaHesabi(Kisi kisi) {
        this.kisi = kisi;
    }

    public BankaHesabi(Kisi kisi, double bakiye) {
        this.kisi = kisi;
        this.bakiye = bakiye;
    }

    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}






















