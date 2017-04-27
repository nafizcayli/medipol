package com.medipol.oop.ders9.orn4;

public class Bisiklet extends Arac {
    String bisikletTipi;

    public Bisiklet(String aracTipi, String bisikletTipi) {
        super(aracTipi);
        this.bisikletTipi = bisikletTipi;
    }

    public void bisikletOzet() {
        super.aracOzet();
        System.out.println("Bisiklet sinifinin ozet() fonksiyonu calistirildi");
    }

    public void detay() {
        System.out.println(super.aracTipi);
        System.out.println(this.bisikletTipi);
    }
}
