package com.medipol.oop.ders9.orn6oop;

public class Personel {
    private String isim;
    private int maas;
    private String soyisim;

    public void ozet() {
        System.out.println(String.format("Isim: %s, Soyisim: %s", this.isim, this.soyisim));
    }

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
}
