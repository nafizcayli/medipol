package com.medipol.oop.quiz;

public class At {
    private String isim;
    private int kilogram;
    private int enerji;

    public At(String isim) {
        this.isim = isim;
        this.kilogram = 50;
        this.enerji = 80;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilogram() {
        return kilogram;
    }

    public void setKilogram(int kilogram) {
        this.kilogram = kilogram;
    }

    public int getEnerji() {
        return enerji;
    }

    public void setEnerji(int enerji) {
        this.enerji = enerji;
    }

    public void beslen() {
        kilogram += 1;
        if (enerji + 10 > 100) {
            enerji = 100;
        } else {
            enerji += 10;
        }
        System.out.println(String.format("%s besleniyor.", isim));
    }

    public void yaris() {
        if (enerji > 40) {
            if (kilogram - 1 < 1) {
                kilogram = 1;
            } else {
                kilogram -= 1;
            }

            if (enerji - 40 < 0) {
                enerji = 0;
            } else {
                enerji -= 40;
            }
            System.out.println(String.format("%s yarisiyor.", isim));
        } else {
            System.out.println("Atin enerjisi yetersiz. Dinlenmesi lazim.");
        }
    }

    public void dinlen() {
        if (enerji == 100) {
            System.out.println("Dinlenmeye gerek yok.");
        } else {
            if (enerji + 50 > 100) {
                enerji = 100;
            } else {
                enerji += 50;
            }
            System.out.println(String.format("%s dinleniyor.", isim));
        }
    }

    public void durum() {
        System.out.println(String.format("Isim: %s, Kilogram: %d, Enerji: %d", isim, kilogram, enerji));
    }
}
