package com.medipol.oop.ders7;

public class BankaHesabi {
    private String kisiIsmi;
    private double bakiye;

    public BankaHesabi() {
    }

    public BankaHesabi(String kisiIsmi) {
        this.kisiIsmi = kisiIsmi;
    }

    public BankaHesabi(String kisiIsmi, double bakiye) {
        this.kisiIsmi = kisiIsmi;
        this.bakiye = bakiye;
    }

    public String getKisiIsmi() {
        return kisiIsmi;
    }

    public void setKisiIsmi(String kisiIsmi) {
        this.kisiIsmi = kisiIsmi;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(double yatirilacakPara) {
        if (yatirilacakPara > 0) {
            bakiye += yatirilacakPara;  // bakiye = bakiye + yatirilacakPara;
            System.out.println(String.format("%fTL hesabiniza yatirildi.", yatirilacakPara));
        } else {
            System.out.println("Negatif para yatiramazsiniz!");
        }

    }

    public void paraCek(double cekilecekPara) {
        if (cekilecekPara > 0) {
            if (bakiye >= cekilecekPara) {
                bakiye -= cekilecekPara; // bakiye = bakiye - cekilecekPara;
                System.out.println(String.format("%fTL hesabinizdan cekildi.", cekilecekPara));
            } else {
                System.out.println("Yeterli bakiye yok!");
            }
        } else {
            System.out.println("Negatif para cekemezsiniz!");
        }

    }

    public void hesapOzeti() {
        System.out.println(String.format("Isim: %s, Bakiye: %f", kisiIsmi, bakiye));
    }


}










