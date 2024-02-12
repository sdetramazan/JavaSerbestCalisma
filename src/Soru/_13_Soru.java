package Soru;

import java.util.Scanner;

public class _13_Soru {
    public static void  main (String[] args){
        //Girilen bir stringin sadece son harfini yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("kelime gir ");
        String kelime= scanner.nextLine();

        int uzunluk = kelime.length();
        char sonHarf = kelime.charAt(uzunluk-1);

        System.out.println("Son Harf " +sonHarf);
    }
}
