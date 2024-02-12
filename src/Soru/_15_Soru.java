package Soru;

import java.util.Scanner;

public class _15_Soru {
    public static void main (String[] args){
        // Tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad)

        Scanner scanner =new Scanner(System.in);
        System.out.print("Ad ve Soyad girin : ");
        String tamAd =scanner.nextLine();

        String ad = tamAd.substring(0,tamAd.indexOf(" "));
        String soyad = tamAd.substring(tamAd.indexOf(" ")+1);

        System.out.println("ad = " + ad + "\nSoyad = " + soyad) ;
    }
}
