package Soru_02;

import java.util.Scanner;

public class _05_Soru {
    public static void main (String[] args){
        //Soru: kullanıcıdan Fizik:90 şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ders ve notunu giriniz= ");
        String dersNotu = scanner.nextLine();

        int nokta=dersNotu.indexOf(":");
        String ders=dersNotu.substring(nokta+1);
        int not =Integer.parseInt(ders);

        //yukardıki kodun kısa yolu
        //int not =Integer.parseInt(dersNotu.replaceAll("[^0-9]",""));

        if (not>=90){
            System.out.println("A");
        } else if (not>=80) {
            System.out.println("B");
        }else if (not>=70) {
            System.out.println("C");
        }else if (not>=60) {
            System.out.println("D");
        }else if (not>=40) {
            System.out.println("E");
        }else
            System.out.println("F");

    }
}
