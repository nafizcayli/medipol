package com.medipol.oop.ders6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AlisverisListesi {
    private ArrayList<String> urunListesi;
    private Scanner okuyucu;
    private PrintWriter yazici;
    private String dosyaIsmi = "alisveris_listem.txt";

    public AlisverisListesi() {
        urunListesi = new ArrayList<String>();
    }

    public void baslat() {
        varsaUrunleriYukle();
        System.out.println("Alisveris listesi programina hosgeldiniz");
        komutAl();
    }

    private void komutAl() {
        System.out.println(String.format("Listenizde %d adet urun var", urunListesi.size()));
        System.out.println("Yapmak istediginiz komutu giriniz (ekle,sil,listele,sifirla,cikis)");

        okuyucu = new Scanner(System.in);
        String komut = okuyucu.nextLine();

        switch (komut) {
            case "cikis":
                urunleriKaydet();
                System.out.println("Iyi gunler");
                break;
            case "ekle":
                urunEkle();
                break;
            case "sil":
                urunuSil();
                break;
            case "listele":
                urunleriListele();
                break;
            case "sifirla":
                listeyiTemizle();
                break;
            default:
                System.out.println("Lutfen gecerli bir komut giriniz");
                komutAl();
                break;

        }
    }

    private void urunEkle() {
        System.out.println("Eklemek istediginiz urunun ismini yaziniz");
        String urun = okuyucu.nextLine();
        urunListesi.add(urun);
        System.out.println(String.format("%s urunu listeye eklendi", urun));
        komutAl();
    }

    private void urunuSil() {
        System.out.println("Silmek istediginiz urunun ismini yaziniz");
        String urun = okuyucu.nextLine();
        urunListesi.remove(urun);
        System.out.println(String.format("%s urunu listeden silindi", urun));
        komutAl();
    }

    private void urunleriListele() {
        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.println(String.format("%d- %s", i + 1, urunListesi.get(i)));
        }
        komutAl();
    }

    private void urunleriKaydet() {
        try {
            yazici = new PrintWriter(new File(dosyaIsmi));
            for (String urunIsmi : urunListesi) {
                yazici.println(urunIsmi);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            yazici.close();
        }

    }

    private void varsaUrunleriYukle() {
        try {
            okuyucu = new Scanner(new File(dosyaIsmi));
            while (okuyucu.hasNext()) {
                String urunIsmi = okuyucu.nextLine();
                urunListesi.add(urunIsmi);
            }
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        } finally {
            if (okuyucu != null) {
                okuyucu.close();
            }
        }
    }

    private void listeyiTemizle() {
        urunListesi.clear();
        komutAl();
    }
}
