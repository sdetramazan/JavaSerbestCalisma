package Soru_03;

import java.util.Scanner;

public class _09_Soru {
    public static void main (String [] args){
        //7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.
        Scanner input = new Scanner(System.in);
        System.out.print("3 basamaklı Sayı girin: ");
        int count = input.nextInt();

        int basamak=0;
        int sayac=1;

        while (count>0){

         basamak = count%10;
            System.out.println(sayac+" ler basamağı değeri: "+basamak);
            count/=10;
            sayac*=10;
        }



    }
}
