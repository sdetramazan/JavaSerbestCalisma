package Soru;

import java.util.Scanner;

public class _14_Soru {
    public static void main (String[] args){

        // Girilen bir ad soyadı örneğin: "ISMET TEMUR" -> I.T. şeklinde yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ad soyad gir : ");
        String adSoyad=scanner.nextLine();

        char adIlkHarf=adSoyad.charAt(0);
        int uzunluk = adSoyad.indexOf(" ");
        char soyadIlkHarf = adSoyad.charAt(uzunluk+1);

        System.out.println("ad ilk harf " + adIlkHarf+"."+"\nsoyad ilk harf "+soyadIlkHarf+".");
    }
}
