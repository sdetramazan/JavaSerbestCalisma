package Soru_01;

import java.util.Scanner;

public class _03_Soru {
    public static void main (String[] args){
        //Girilen bir öğrencinin notuna göre 50 den büyük -eşit
        //ise geçtiniz, küçük ise kaldınız yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("not giriniz = ");
        int not = scanner.nextInt();

        if (not>=50){
            System.out.println("Geçtiniz");
        }else
            System.out.println("Kaldınız");
    }
}
