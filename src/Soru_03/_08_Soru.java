package Soru_03;

import java.util.Scanner;

public class _08_Soru {
    public static void main (String [] args){
        //6- Bir sayı bulmaca oyunu yapılmak isteniyor
        //
        //    bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //
        //   Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //
        //   bilemediniz yazıp tutulan sayıyı bildirsin.
        //
        //   Eğer bilirse tebrikler yazsın.

        int rndSayi = (int) (Math.random()*(20-10)+10);
        System.out.println("random sayı: " +rndSayi);

        Scanner input = new Scanner(System.in);

        int tahmin=0;
        int sayac=1;

        do {
            System.out.print("Tahmininizi giriniz: ");
            tahmin = input.nextInt();

            if (rndSayi==tahmin){
                System.out.println("TEBRİKLER...");
                break;
            } else if (sayac!=3) {
                System.out.println("Bilemediniz tekrar deneyin");
                System.out.println();
            }else {
                System.out.println("hakkınız bitti bilemediniz tutulan sayı: "+rndSayi);
            }
            sayac++;

        }while (sayac<=3);




    }
}
