package com.medipol.oop.ders5;/*

    Kullanicinin istedigi miktarda sayiyi toplayip
    toplami ekrana yazdiran programi yaziniz

    Kac sayiyi toplamak istiyorsunuz?
    3 {DEGISKEN}

    1. sayiyi giriniz
    5
    2. sayiyi giriniz
    10
    3. sayiyi giriniz
    20

    Girdiginiz 3{DEGISKEN} sayinin toplami: 35

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kac adet sayiyi toplamak istiyorsunuz?");

        int toplanacakSayiAdedi = 0;
        int toplam = 0;

        while (true) {
            try {
                toplanacakSayiAdedi = scanner.nextInt();
                break;
            } catch (InputMismatchException hata) {
                scanner.nextLine();
                System.out.println("Lutfen gecerli bir sayi giriniz");
            }
        }

        for (int i = 0; i < toplanacakSayiAdedi; i++) {
            System.out.println(String.format("%d. sayiyi giriniz", i + 1));

            while (true) {
                try {
                    int girilenSayi = scanner.nextInt();
                    toplam += girilenSayi;
                    break;
                } catch (InputMismatchException hata) {
                    scanner.nextLine();
                    System.out.println("Lutfen gecerli bir sayi giriniz");
                }
            }

        }


        System.out.println(String.format("Girdiginiz %d adet sayinin toplami: %d", toplanacakSayiAdedi, toplam));


    }

}




















