package com.medipol.oop.ders7;

public class BankaHesabiTest {
    public static void main(String[] args) {
        BankaHesabi bankaHesabi = new BankaHesabi("Nafiz", 100);
        bankaHesabi.hesapOzeti();
        bankaHesabi.paraCek(-1000);
        bankaHesabi.hesapOzeti();
        bankaHesabi.paraYatir(150.5);
        bankaHesabi.hesapOzeti();
        bankaHesabi.paraCek(150.5);
        bankaHesabi.hesapOzeti();
        bankaHesabi.paraCek(-100);
        bankaHesabi.hesapOzeti();
    }
}
