package com.medipol.oop.ders9.orn6normal;

public class Ogretmen {
    private String isim;
    private String soyisim;
    private int maas;
    private String ders;

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

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }

    public void ozet() {
        System.out.println(String.format("Isim: %s, Soyisim: %s", this.isim, this.soyisim));

    }
}


















