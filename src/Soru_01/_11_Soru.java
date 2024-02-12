package Soru_01;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {
        //otopark üçretleri:
        //3 saate kadar 10tl , 5 saate kadar 15 tl, saat 5 den fazla ise 20 tl  dir.
        //kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("park süresini giriniz=");
        int sure = scanner.nextInt();

        if (sure<3){
            System.out.println("park ücreti 10TL");
        }if (sure>=3&&sure<5){
            System.out.println("park ücreti 15TL");
        }if (sure>=5){
            System.out.println("park ücreti 20tl");
        }
    }
}
