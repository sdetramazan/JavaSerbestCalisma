package Soru_02;

import java.util.Scanner;

public class _01_Soru {
    public static void main (String[] args){
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız
        //kullanıcı bilirse tebrikler yazdırnız
        // 5 girersem 5 e kadar sayı üretsin, ben tahmin etmeye çalıyım,
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı girin = ");
        int sayi = scanner.nextInt();

        int rndSayi= (int) (Math.random()*sayi);
        System.out.println("rndSayi = " + rndSayi);

        System.out.print("Tahminizi giriniz= ");
        int tahmin = scanner.nextInt();

        System.out.println((tahmin==rndSayi) ? "Tebrikler" : "bilemediniz");
    }
}
