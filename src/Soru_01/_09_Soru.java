package Soru_01;

import java.util.Scanner;

public class _09_Soru {
   /* public static void main (String[] args){
        //1-yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67   gibi
        Scanner scanner = new Scanner(System.in);
        System.out.print("yan yana iki sayı giriniz = ");
        String kelime =scanner.nextLine();

        int bosluk =kelime.indexOf(" ");

        String sayi1= kelime.substring(0,bosluk);
        String sayi2 = kelime.substring(bosluk+1);


        int sayi1int=Integer.parseInt(sayi1);
        int sayi2int=Integer.parseInt(sayi2);
        if (sayi1int==sayi2int){
            System.out.println("sayılar eşit");
        }else
            System.out.println("sayılar eşit değil");

    }*/

    public static void main (String[] args){
        // 2- yan yana aralarında bir boslukla girilen 3 int sayının
// toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
// 45 67 123

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz =");
        String sayiStr = scanner.nextLine();

        int bosluk =sayiStr.indexOf(" ");
        int bosluk2=sayiStr.lastIndexOf(" ");


        String sayi1=sayiStr.substring(0,bosluk);
        String sayi2 =sayiStr.substring(bosluk+1,bosluk2);
        String sayi3 =sayiStr.substring(bosluk2+1);

        int sayiInt1=Integer.parseInt(sayi1);
        int sayiInt2=Integer.parseInt(sayi2);
        int sayiInt3=Integer.parseInt(sayi3);

        int toplam = sayiInt1+sayiInt2+sayiInt3;

        if (toplam%2==0){
            System.out.println("toplamı çifttir");
        }else
            System.out.println("toplamı tektir");



    }



}
