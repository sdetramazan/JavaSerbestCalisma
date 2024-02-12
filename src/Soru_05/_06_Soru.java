package Soru_05;

import java.util.Scanner;

public class _06_Soru {
    public static void main (String[] args){
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.
        Scanner input = new Scanner(System.in);
        System.out.print("String gir :");
        String word = input.nextLine();

        char harf=' ';
        String bitisik =word.replaceAll(" ", "");


        for (int i = 0; i <bitisik.length() ; i++) {

            harf = bitisik.charAt(i);
            System.out.println(harf);

        }

    }
}
