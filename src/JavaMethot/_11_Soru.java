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
        powerOfThree(userNumberEntry());
    }

    public static boolean powerOfThree(int number){
        boolean result=false;

        for (int i = 0; i < number; i++) {
            if (i*i*i==number){
                result=true;
            }
        }
        System.out.println(result);
        return result;
    }

    public static int userNumberEntry(){
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        return input.nextInt();
    }





}
