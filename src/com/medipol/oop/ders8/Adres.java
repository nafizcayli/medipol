package com.medipol.oop.ders8;

public class Adres {
    private String acikAdres;
    private String sehir;
    private String ulke;
    private int postaKodu;

    public Adres(String acikAdres, String sehir, String ulke) {
        this.acikAdres = acikAdres;
        this.sehir = sehir;
        this.ulke = ulke;
    }

    public Adres(String acikAdres, String sehir, String ulke, int postaKodu) {
        this.acikAdres = acikAdres;
        this.sehir = sehir;
        this.ulke = ulke;
        this.postaKodu = postaKodu;
    }

    public String getAcikAdres() {
        return acikAdres;
    }

    public void setAcikAdres(String acikAdres) {
        this.acikAdres = acikAdres;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public int getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(int postaKodu) {
        this.postaKodu = postaKodu;
    }
}
