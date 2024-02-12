package Soru;

import java.util.Scanner;

public class _12_Soru {
    public static void main (String[] args){
        //10- Kullanıcıdan alacağının 2 sayının 4 işlemini ekrana yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz = ");
        int sayi1=scanner.nextInt();

        System.out.print("2. sayıyı giriniz = ");
        int sayi2 = scanner.nextInt();

        int toplam = sayi1+sayi2;
        int fark = sayi1-sayi2;
        int carpim =sayi1*sayi2;
        double bolum= sayi1/(double)sayi2;

        System.out.println("toplam = " + toplam);
        System.out.println("fark = " + fark);
        System.out.println("carpim = " + carpim);
        System.out.println("bolum = " + bolum);

    }
}
