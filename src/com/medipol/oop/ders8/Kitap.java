package com.medipol.oop.ders8;

public class Kitap {
    private String isim;
    private int sayfaSayisi;
    private Yazar yazar;

    public Kitap(String isim, int sayfaSayisi, Yazar yazar) {
        this.isim = isim;
        this.sayfaSayisi = sayfaSayisi;
        this.yazar = yazar;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }
}
