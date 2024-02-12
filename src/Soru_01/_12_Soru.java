package Soru_01;

import java.util.Scanner;

public class _12_Soru {
    public static void main (String[] args){
        //kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz =");
        int sayi = scanner.nextInt();
        String sonuc = (sayi%2==0) ? "çift" : "Tek";
        System.out.println("sonuc = " + sonuc);
    }
}
