package Mini_Projeler;

import java.util.Scanner;

public class _03_MukemmelSayi {
    public static void main (String[] args){
        //Mükemmel sayıyı  bulan programı yazalım
        //Kullanıcının gireceği sayının mükemmel olup olmadğını bulunuz
        //Mükemmel sayı tam bölenlerinin toplamı kendisine eşit olan sayı demek.

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        int total=0;

        for (int i = 1; i < number; i++) {
           if (number%(i)==0){
               total=total+i;
           }
        }if (number==total){
            System.out.println(number+" mükemmel sayı");
        }else
            System.out.println(number+" mükemmel sayı değil");
    }
}
