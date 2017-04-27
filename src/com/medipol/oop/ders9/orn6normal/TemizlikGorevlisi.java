package com.medipol.oop.ders9.orn6normal;

public class TemizlikGorevlisi {
    private String isim;
    private String soyisim;
    private int maas;
    private int gorevliOlduguKat;


    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getGorevliOlduguKat() {
        return gorevliOlduguKat;
    }

    public void setGorevliOlduguKat(int gorevliOlduguKat) {
        this.gorevliOlduguKat = gorevliOlduguKat;
    }

    public void ozet() {
        System.out.println(String.format("Isim: %s, Soyisim: %s", this.isim, this.soyisim));
    }
}











