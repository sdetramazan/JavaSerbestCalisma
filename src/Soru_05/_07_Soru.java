package Soru_05;

import java.util.Scanner;

public class _07_Soru {
    public static void main (String [] args){

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner input = new Scanner(System.in);
        System.out.print("String gir : ");
        String word = input.nextLine();

        for (int i = 0; i <word.length(); i++) {

            if (word.charAt(i)==' ')
                continue;
            System.out.println(word.charAt(i));

        }
    }
}
