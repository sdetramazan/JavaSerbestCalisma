package JavaMethot;

import java.util.Scanner;

public class _11_Soru {
    //Soru6-"powerOfThree" isminde bir method oluşturun.
    //Parametre olarak int,return tipi boolean olmalı.
    //Bir tamsayı girildiğinde, tamsayının 3 üssü olup olmadığını teyit eden programı yazınız.
    //3'ün üssü(kuvveti) ise true, değilse false döndürün.
    //Örnek girdi:27 --> Çıktı:true
    //Açıklama: 3*3*3 =27
    //Sonuç= true
    public static void main(String[] args) {
        System.out.println(powerOfThree(number()));

    }
    public static boolean powerOfThree(int number){

        boolean isThere=false;
        for (int i = 1; i <=number ; i++) {
           if ((i*i*i)==number)
            isThere=true;
            }
         return isThere;
    }
    public static  int number(){
        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz:");
        return input.nextInt();
    }

}
