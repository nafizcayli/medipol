package com.medipol.oop.ders8;

public class Yazar {
    private String isim;
    private String soyismi;

    public Yazar(String isim, String soyismi) {
        this.isim = isim;
        this.soyismi = soyismi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyismi() {
        return soyismi;
    }

    public void setSoyismi(String soyismi) {
        this.soyismi = soyismi;
    }
}
