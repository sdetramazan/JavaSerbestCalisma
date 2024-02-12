package Soru_01;

import java.util.Scanner;

public class _01_Soru {
    public static void main (String[] args){
//girilen 2 sayıdan büyük olanın değerini ekrana yazdırınız
        // eşit ise eşit yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir = ");
        int sayi1 = scanner.nextInt();

        System.out.print("Sayı gir =");
        int sayi2 = scanner.nextInt();

        if (sayi1<sayi2){
            System.out.println("büyük olan sayı = "+ sayi2);
        } else if (sayi1>sayi2) {
            System.out.println("Büyük sayı = " +sayi1);

        }else
            System.out.println("Sayılar eşit");
    }
}
