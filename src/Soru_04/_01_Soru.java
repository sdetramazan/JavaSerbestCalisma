package Soru_04;

import java.util.Scanner;

public class _01_Soru {
    public static void main (String[] args){
        //kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz

       /* Scanner input = new Scanner(System.in);
        int sayi=1;
        int toplam=0;

        while (sayi!=0){
            System.out.print("sayı giriniz: ");
            sayi=input.nextInt();

            toplam+=sayi;

        }
        System.out.println("toplam = " + toplam);*/

        //kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz

        Scanner input = new Scanner(System.in);

        int sayi=1;
        int toplam=0;

        do {
            System.out.print("sayi giriniz : ");
            sayi = input.nextInt();
            toplam+=sayi;

        }while (sayi!=0);

        System.out.println("toplam = " + toplam);
    }
}
