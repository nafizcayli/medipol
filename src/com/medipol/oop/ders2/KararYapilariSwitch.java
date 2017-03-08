package com.medipol.oop.ders2;

public class KararYapilariSwitch {
    public static void main(String[] args) {


//        switch (degisken) {
//            case deger1:
//                degisken deger1 ifadesine esit ise calistirilacak kod bloku
//                break;
//            case deger2:
//                degisken deger2 ifadesine esit ise calistirilacak kod bloku
//                break;
//            case deger3:
//            case deger4:
//                degisken deger3 veya deger4 ifadesine esit ise calistirilacak kod bloku
//                break;
//            default:
//                degisken yukaridaki degerlerden hicbirine esit degil ise calistirilacak kod bloku
//                break;
//        }

        int islemNo = 3;

        switch (islemNo) {
            case 1:
                System.out.println("Bakiye goruntuleme menusu");
                break;
            case 2:
                System.out.println("Fatura odeme menusu");
                break;
            case 3:
                System.out.println("Para cekme menusu");
                break;
            default:
                System.out.println("Hatali islem numarasi sectiniz");
                break;
        }


        int ay = 12;

        switch (ay) {
            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Boyle bir ay yok!");
                break;
        }


        System.out.println("Program bitti");

    }
}
