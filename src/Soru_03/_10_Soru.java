package Soru_03;

import java.util.Scanner;

public class _10_Soru {
    public static void main (String [] args){
//8- Girilen bir sayının kaç basamak olduğunu bulunuz.

       /* Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int count = input.nextInt();
        int sayac=0;
        while (count>0){

            count/=10;
            sayac++;
        }
        System.out.println("basamak sayısı = " + sayac);*/

       // Soru-9 Girilen bir sayının tersi olan sayıyı bulan programı yazınız.Örnek : 124 girildi ise
       // tersi olan 421 sayısı elde edilsin.Yani simetri sayı mı?
        
       /* Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int count = input.nextInt();
        
        int tersi=0;
        
        while (count>0){
            
            tersi=(tersi*10)+(count%10);
            count/=10;
    }
        System.out.print("tersi = " + tersi);*/

         //10- Girilen bir sayının tersi ile aynı olup olmadığını bulunuz. yani simetrik sayı mı?

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int count = input.nextInt();
        int kontrol = count;
        int tersi =0;

        while (count>0){

            tersi=(tersi*10)+(count%10);
            count/=10;


        }
        if (kontrol==tersi){
            System.out.println("Simetrik sayıdır");
        }else {
            System.out.println("simetrik sayı değildir");
        }

    }
}
