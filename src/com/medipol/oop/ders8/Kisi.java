package com.medipol.oop.ders8;

public class Kisi {
    private String isim;
    private String soyisim;
    private long tcNo;
    private Adres adres;

    public Kisi(String isim, String soyisim, long tcNo, Adres adres) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.tcNo = tcNo;
        this.adres = adres;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}






