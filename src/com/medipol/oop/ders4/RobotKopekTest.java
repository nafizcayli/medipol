package com.medipol.oop.ders4;

public class RobotKopekTest {
    public static void main(String[] args) {

        RobotKopek robotKopek1 = new RobotKopek();

//        robotKopek1.isim = "Rex";  //  Kapsulleme yaptigimiz icin nokta (.) operatoru ile sinifin degiskenlerine ulasamiyoruz.
//        robotKopek1.yas = 12; //  Kapsulleme yaptigimiz icin nokta (.) operatoru ile sinifin degiskenlerine ulasamiyoruz.

        robotKopek1.setIsim("Rex"); // Bunun yerine tanimladigimiz set methodlarini kullanarak ilgili alanin degerini atiyoruz.
        robotKopek1.setYas(12);// Bunun yerine tanimladigimiz set methodlarini kullanarak ilgili alanin degerini atiyoruz.


//        Kapsulleme yapip, nesne degiskenlerini private, yani sinif'a ozgu olarak tanimladigimizdan
//        olusturdugumuz nesnenin icerisindeki degiskenlere nokta(.) operatoru ile ulasamiyoruz.
//        System.out.println("Kopegin ismi " + robotKopek1.isim + " ve bu kopek " + robotKopek1.yas + " yasinda"); // bu kisim hata verecektir

//        Bu sebeple sinifin degiskenlerine ulasabilmek icin tanimladigimiz get methodlarini kullanacagiz.
        System.out.println("Kopegin ismi " + robotKopek1.getIsim() + " ve bu kopek " + robotKopek1.getYas() + " yasinda");

        int ikiliToplam = robotKopek1.topla(5, 5);
        System.out.println("Toplam sonucu: " + ikiliToplam);

        int ucluToplam = robotKopek1.topla(10, 20, 30);
        System.out.println("Toplam sonucu: " + ucluToplam);

        String getirilenNesne1 = robotKopek1.getir("String Nesnesi");
        System.out.println("Getirilen nesne: " + getirilenNesne1);

        int getirilenSayi = robotKopek1.getir(100);
        System.out.println("Getirilen nesne: " + getirilenSayi);


        int toplamSonucu = robotKopek1.topla(3, 12);
        System.out.println("Toplama isleminin sonucu: " + toplamSonucu);


//        Java 'da fonksiyonlara parametre olarak gonderilen degiskenlerin kendileri degil, birer kopyalari gonderilir.
//        Boylelikle fonksiyon, parametre olarak aldigi degiskenin uzerinde degisiklik yapsa da, parametre olarak gonderilen degiskenlerin
//        degerleri degismez.

        int cikartilacakSayi = 5;
        int birCikarSonucu = robotKopek1.birCikart(cikartilacakSayi);

        System.out.println("Gonderilen sayi: " + cikartilacakSayi); // parametre olarak gonderdigimiz cikartilacakSayi degiskenin fonksiyondan sonra degeri degismiyor.
        System.out.println("Fonksiyon Sonucu: " + birCikarSonucu);


        robotKopek1.havla(5);
        String getirilenNesne = robotKopek1.terlikGetir();
        System.out.println("Getirilen nesne: " + getirilenNesne);

        String getirilenNesne2 = robotKopek1.getir("Gazete");
        System.out.println("Getirilen nesne: " + getirilenNesne2);
        String getirilenNesne3 = robotKopek1.getir("Ayakkabi");
        System.out.println("Getirilen nesne: " + getirilenNesne3);


//        Java Sanal Makinesine tanimladigimiz RobotKopek sinifindan bir nesne daha olusturmasini soyluyoruz
        RobotKopek robotKopek2 = new RobotKopek();

        robotKopek2.setIsim("Lessie");
        robotKopek2.setYas(10);

        System.out.println("Kopegin ismi " + robotKopek2.getIsim() + " ve bu kopek " + robotKopek2.getYas() + " yasinda");
    }
}
