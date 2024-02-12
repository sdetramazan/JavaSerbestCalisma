package Soru;

import java.util.Scanner;

public class _17_Soru {
    public static void main (String[] args){
        //girilen bir sayının tek sayı olup olmadığını yazdrırınız
        //true ya da false
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir = ");
        int sayi = scanner.nextInt();

       int kalan = sayi%2;

       boolean tekMi = (kalan==1);

        System.out.println("tekMi = " + tekMi);
    }


}
