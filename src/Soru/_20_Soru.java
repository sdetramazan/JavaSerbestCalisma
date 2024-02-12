package Soru;

import java.util.Scanner;

public class _20_Soru {
    public static void main (String[] args){

        //Girilen bir sayının negatif mi, pozitif mi olduğunu yazdırınız
        //sıfır ise sıfır yazacak

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir = ");
        int sayi =scanner.nextInt();

        if (sayi<0){
            System.out.println("Negatif");
        } else if (sayi==0) {
            System.out.println("sıfıra eşit");

        }else
            System.out.println("Pozitif");
    }
}
