package Soru_01;

import java.util.Scanner;

public class _16_Soru {
    public static void main(String[] args) {
        // math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı giriniz = ");
        int sayi1 = scanner.nextInt();

        System.out.print("sayı giriniz = ");
        int sayi2 = scanner.nextInt();

        System.out.print("sayı giriniz = ");
        int sayi3 = scanner.nextInt();

        //1.yol
        int buyuk = Math.max(sayi1, sayi2);
        int enBuyuk = Math.max(buyuk, sayi3);
        System.out.println(enBuyuk);

        //2.yol
        System.out.println(Math.max(Math.max(sayi1, sayi2), (Math.max(Math.max(sayi1, sayi2), sayi3))));
    }
}
