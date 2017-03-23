package com.medipol.oop.ders5;

import java.util.InputMismatchException; // programda kullanilacak Siniflari once 'import' komutu ile ekliyoruz
import java.util.Scanner; // programda kullanilacak Siniflari once 'import' komutu ile ekliyoruz

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner nesnesinin olusturulmasi

//        Istisna (Exception) olusturabilecek ifadeleri try blogu icerisinde tanimlayip olusacak hatalari catch blogu ile yakalariz

//        try {
//          istisna olusturabilecek ifadeler
//        } catch (IstisnaSinifi1 hata) {
//            try bolugunun icerisindeki kod calistirilirken
//            IstisnaSinifi1 ismindeki istisna ortaya ciktiginda calistirilacak kod blogu
//        }catch (IstisnaSinifi2 hata){
//            try bolugunun icerisindeki kod calistirilirken
//            IstisnaSinifi1 ismindeki istisna ortaya ciktiginda calistirilacak kod blogu
//        }finally{
//           Istisnai durum olussa da olusmasa da en son olarak calistirilacak kod blogu
//        }


        System.out.println("Lutfen bir sayi giriniz:");
        try {
            int girilenSayi = scanner.nextInt();
            System.out.println(String.format("Girdiginiz sayi %d", girilenSayi));
        } catch (InputMismatchException hata) {
            System.out.println("Lutfen gecerli bir sayi giriniz.");
        }
        System.out.println("Program bitti!");


//        Kullanici gecerli bir sayi girene kadar kullanicidan tekrar tekrar sayi girmesini saglayan program
        System.out.println("Lutfen bir sayi giriniz:");
        while (true) { // sonsuz bir dongu yaratiyoruz, istedigimiz kosullar saglandiginda kendimiz donguyu kiracagiz (break)
            try { // istisna yaratacak kodu try blogu icerisine yaziyoruz
                int girilenSayi = scanner.nextInt(); // scanner.nextInt() fonksiyonuna tam sayidan baska bir deger verilirse InputMismatchException istisnasi olusacak
                break; // eger istisna olusmazsa istedigimiz olmustur, sonsuz donguyu kirip devam edebiliriz
            } catch (InputMismatchException hata) { // yakalamak istedigimiz InputMismatchException ismindeki istisnai durum
                scanner.nextLine(); // bir istisna olusmus. Bu durumda scanner'dan kullanicinin girdigi satiri komple okumasini istiyoruz. Boylelikle kullanicidan yeni bir girdi alabilecegiz
                System.out.println("Lutfen gecerli bir sayi giriniz!"); // Kullaniciyi olusan hata hakkinda uyariyoruz
            } finally { // finally blogu
                System.out.println("Burasi finally kismi"); // try blogunda istisna olussa da olusmasa da en son olarak calistirilacak ifade
            }
        }
        System.out.println("Program bitti");


    }
}
