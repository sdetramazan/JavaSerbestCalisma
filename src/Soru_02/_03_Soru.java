package Soru_02;

import java.util.Scanner;

public class _03_Soru {
    public static void main (String[] args){
        //Girilen 2 tamsayıyı kullanıcıdan aldıktan sonra,
        //Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullnıcıdan alarak isteğe uygun olan
        //işlemi yaptırıp sonucu yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı gir = ");
        int sayi1 = scanner.nextInt();

        System.out.print("sayı gir = ");
        int sayi2 =scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("işlem için harf gir (T-Ç-P-B)=");
        String harf = scanner1.next();

       if (harf.equalsIgnoreCase("T")){
            System.out.println("Toplam = " +(sayi1+sayi2));
        }else if (harf.equalsIgnoreCase("Ç")){
            System.out.println("Çıkarma = " +(sayi1-sayi2));
        }else if (harf.equalsIgnoreCase("P")){
            System.out.println("Çarpma = " +(sayi1*sayi2));
        }else if (harf.equalsIgnoreCase("B")){
            System.out.println("Bölme = " + (sayi1 * sayi2));
        }else{
            System.out.println("Hatalı harf girdiniz");}




    }
}
