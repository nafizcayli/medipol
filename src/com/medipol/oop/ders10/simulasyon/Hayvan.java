package com.medipol.oop.ders10.simulasyon;

public abstract class Hayvan {
    private String resim;
    private String yiyecek;
    private int aclik;
    private int sinirlar;
    private int lokasyon;

    public abstract void sesCikart();

    public abstract void yemekYe();

    public abstract void dolas();

    public void uyu() {
        System.out.println("Uyuyorum");
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public String getYiyecek() {
        return yiyecek;
    }

    public void setYiyecek(String yiyecek) {
        this.yiyecek = yiyecek;
    }

    public int getAclik() {
        return aclik;
    }

    public void setAclik(int aclik) {
        this.aclik = aclik;
    }

    public int getSinirlar() {
        return sinirlar;
    }

    public void setSinirlar(int sinirlar) {
        this.sinirlar = sinirlar;
    }

    public int getLokasyon() {
        return lokasyon;
    }

    public void setLokasyon(int lokasyon) {
        this.lokasyon = lokasyon;
    }
}
