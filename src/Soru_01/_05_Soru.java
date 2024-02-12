package Soru_01;

import java.util.Scanner;

public class _05_Soru {
    public static void main (String[] args){
        // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığını bulunuz

        Scanner scanner = new Scanner(System.in);
        System.out.print("cümle gir = ");
        String cumle = scanner.nextLine();

        cumle =cumle.toLowerCase();

        if (cumle.contains("a")){
            System.out.println("a var");
        }else
            System.out.println("a yok");
    }
}
