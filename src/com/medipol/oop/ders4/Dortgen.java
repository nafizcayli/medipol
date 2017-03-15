package com.medipol.oop.ders4;

public class Dortgen { // Sinif tanimi
// Dortgen sadece normal bir sinif, ana methodu yok. Bu yuzden bu sinifi test etmek icin DortgenTest isimli
// bir sinif daha olusturup, onun ana methodu icerisinde bu Dortgen sinifimizi test edecegiz.

    // Nesnenin bilgi sahibi oldugu degiskenler (instance variables)
    private int kisaKenar;
    private int uzunKenar;

//    Bir nesnenin sahip oldugu degiskenler (instance variables) icin Java varsayilan olarak (default) degerler olusturur.

//    Bu degerler asagidaki gibidir:
//    tam sayi degiskenleri = 0
//    kesirli sayi degiskenleri = 0.0
//    boolean degiskenler= false
//    nesneler = null


    //    Nesnenin degiskenlerine kapsulleme yolu ile disaridan erisime kapattigimiz icin
//    kullaniciya/programciya bu degiskenlere deger atamasi ve bu degiskenlerin degerlerini ogrenmesi icin
//    olusturulmus getter/setter methodlar.
    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        if (kisaKenar > 0) {
            this.kisaKenar = kisaKenar;
        }
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        if (uzunKenar > 0) {
            this.uzunKenar = uzunKenar;
        }
    }


    public float alaniHesapla() {
        return this.kisaKenar * this.uzunKenar; // 'this' kelimesi, JVM'ye bu sinifin degiskenleri olan 'kisaKenar' ve 'uzunKenar'i ifade eder
//        return kisaKenar * uzunKenar;         // Eger ayni isimde baska bir degisken tanimlamadiysak, 'this' kelimesi olmadan da degiskenleri ifade edebiliriz
//        return getKisaKenar() * getUzunKenar();   // Kapsulleme methodlarindan get (degiskenin degerini donduren) fonksiyonlarini kullanarak da ayni isi yapan kodu yapabilirdik
    }

    public float cevresiniHesapla() {
        return (this.kisaKenar + this.uzunKenar) * 2;
//        return (kisaKenar + uzunKenar) * 2;
//        return (getKisaKenar() + getUzunKenar()) * 2;
    }

    public boolean kareMi() {
        return this.kisaKenar == this.uzunKenar;
//        return kisaKenar == uzunKenar;
//        return getKisaKenar() == getUzunKenar();
    }


}
