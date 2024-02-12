package Soru_04;

import java.util.Scanner;

public class _03_Soru {
  /*  public static void main(String[] args) {
        //7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.

        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int number = input.nextInt();

        int basamak = 0;
        int sayac = 1;

        while (number > 0) {
            basamak = number % 10;
            System.out.println(sayac + "ler " + "basamağı = " + basamak);
            sayac *= 10;
            number /= 10;
        }
    }*/

//8- Girilen bir sayının kaç basamak olduğunu bulunuz.

    /*public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz = ");
        int number = input.nextInt();

        int basamak =0;
        int sayac =0;
        int sayi =number;

        while (number>0){

          number/=10;
            sayac++;

        }
        System.out.println(sayi+ " sayısı  " + sayac+ "  basamaklıdır.");

    }*/

//
//9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.
    
  /*  public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("sayı gir = ");
        int number = input.nextInt();
        
        int tersi =0;
        int orginalNumber=number;




        while (number>0){

            tersi = (tersi*10)+(number%10);
            number/=10;

        }
        System.out.print(orginalNumber+" sayısının tersi = " + tersi);
    }*/
    
    
//
//10- Girilen bir sayının tersi ile aynı olup olmadığını bulunuz. yani simetrik sayı mı?
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int number = input.nextInt();
        int numberOne=number;
        int tersi =0;

        while (number>0){
            
            tersi= (tersi*10)+(number%10);
            number/=10;
        }
        if (numberOne==tersi){
            System.out.println("Sayı ve tersi simetridir");
        }else {
            System.out.println("sayı ve tersi simetri değildir");
        }
        System.out.println("tersi = " + tersi);
    }


}