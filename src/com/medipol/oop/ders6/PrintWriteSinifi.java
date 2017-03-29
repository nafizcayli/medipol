package com.medipol.oop.ders6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriteSinifi {
    public static void main(String[] args) {

        String dosyaIsmi = "deneme.txt"; // yazacagimiz dosya ismi
        File dosya = new File(dosyaIsmi); // yazimda kullanilacak File nesnesi

        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileOutputStream(dosya, true));

            int girilecekSatirSayisi = 10;
            for (int i = 0; i < girilecekSatirSayisi; i++) {
                printWriter.format("%d. satir", i + 1).println(); // 10 satir yazi yaziyoruz
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (printWriter != null) { // eger bir hata ile karsilasilmamissa ve printWriter nesnesi null degilse
                printWriter.close(); // isimiz bittikten sonra nesneyi close() fonksiyonu ile kapatiyoruz
            }
        }

        Scanner scanner = null; // yazdigimiz dosyayi okumak icin Scanner nesnesi olusturacagiz
        try {
            scanner = new Scanner(dosya); // Scanner nesnesini dosyadan okumak icin ayarliyoruz
            while (scanner.hasNext()) { // Okunacak satir oldugu surece
                String satir = scanner.nextLine(); // satiri oku
                System.out.println(satir); // ekrana yaz
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) { // eger bir hata ile karsilasilmamissa ve scanner nesnesi null degilse
                scanner.close(); // isimiz bittikten sonra nesneyi close() fonksiyonu ile kapatiyoruz
            }
        }

    }
}











