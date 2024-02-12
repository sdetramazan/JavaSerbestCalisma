package Soru_03;

import java.util.Scanner;

public class _07_Soru {
    public static void main (String [] args){
        //Soru-7 Girilen 3 basamaklı bir sayının birler, onlar ve yüzler basamağını bulan programı
        //yazınız.

        Scanner input = new Scanner(System.in);
        System.out.print("3 basamaklı sayı gir = ");
        int sayi = input.nextInt();

        int basamak;
        int sayac=1;

        while (sayi>0){

            basamak=sayi%10;
            System.out.println(sayac+" ler basamağı " +basamak);
            sayi/=10;
            sayac*=10;
        }

    }
}
