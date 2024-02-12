package Soru_01;

import java.util.Scanner;

public class _13_Soru {
    public static void main (String[] args0){
        //Soru: Girilen sayı 50 den büyük ise 1, değilse o değirini
        // ekrana yazdırınız. ternary operatör ile yapınız
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir = ");
        int sayi = scanner.nextInt();

        System.out.println((sayi>50) ? "1" : "0");

    }
}
