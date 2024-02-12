package Soru_02;

import java.util.Scanner;

public class _04_Soru {
    public static void main (String[] args){

        //Soru: kullanıcıdan Fizik:90 şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ders ve  notunu giriniz: ");
        String not =scanner.nextLine();

        int sayi =not.indexOf(":");
        String strNot =not.substring(sayi+1);
        int notInt = Integer.parseInt(strNot);

       /* String notRInt = not.replaceAll("[^0-9]","");
        System.out.println("notRInt = " + notRInt);
        int notRAInt =Integer.parseInt(notRInt);*/


        if (notInt>=90){
            System.out.println("A");
        } else if (notInt>=80) {
            System.out.println("B");
        }else if (notInt>=70) {
            System.out.println("C");
        }else if (notInt>=60) {
            System.out.println("D");
        }else if (notInt>=40) {
            System.out.println("E");
        }else
            System.out.println("F");
        }



}
