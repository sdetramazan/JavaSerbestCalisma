package Soru_01;

import java.util.Scanner;

public class _06_Soru {
    public static void main (String[] args){
       // 1- Girilen bir sayının birler basamağını tek olup olmadığını ekrana yazdırınız.
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi = scanner.nextInt();

        if (sayi%2==1){
            System.out.println("sayı tektir");
        }else
            System.out.println("sayı tek değildir");*/

        //2- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bularak,
        //50 ve yukarısında ise geçtiniz , altında ise kaldınız yazdırınız.
       /* Scanner scanner =new Scanner(System.in);
        System.out.print("vize notu = ");
        double vize =scanner.nextDouble();

        System.out.print("Final not giriniz = ");
        double finalNot= scanner.nextDouble();

        double ort = (vize*0.4)+(0.6*finalNot);

        if (ort>=50){
            System.out.println("ortalama "+ort+" puanla geçtiniz...");
        }else
            System.out.println("ortalama " +ort+ " puanla kaldınız");*/


        //3- Girilen bir cümle A harfi ile başlıyorsa , EVET, başlamıyorsa HAYIR yazdırınız.
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("cümle giriniz ");
        String cumle = scanner.nextLine();

        if(cumle.startsWith("A")){
            System.out.println("EVET");
        }else
            System.out.println("HAYIR");*/

        //4- Kullanıcıdan 2 kere şifresini isteyiniz, aynı ise TAMAM, değil ise HATALI şifre yazınız.
        Scanner scanner =new Scanner(System.in);
        System.out.print("Şifre gir = ");
        String sifre1 = scanner.next();

        System.out.print("Şifre giriniz = ");
        String sifre2 = scanner.next();

        if (sifre1.equals(sifre2)){
            System.out.println("Taman");
        }else
            System.out.println("hatalı");
    }
}
