package Soru_01;

import java.util.Scanner;

public class _14_Soru {
    public static void main(String[] args){
        //otopark üçretleri:(ternary operatörü ile yapınız)
        //3 saate kadar 10tl , 5 saate kadar 15 tl, saat 5 den fazla ise 20 tl  dir.
        //kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("otopark süresini giriniz = ");
        int sure = scanner.nextInt();

        System.out.println((sure<3) ? "10 tl": (sure>3 && sure<5) ? "15 tl": "20 tl");

    }
}
