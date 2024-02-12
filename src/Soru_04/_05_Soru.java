package Soru_04;

import java.util.Scanner;

public class _05_Soru {
    public static void main (String [] args){
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        Scanner input = new Scanner(System.in);
        String kelime ="";

        while (!kelime.equalsIgnoreCase("x")){
            System.out.print("harf gir: ");
            kelime=input.nextLine();
            System.out.println(" Program çalışıyor");
        }
        System.out.println("Program bitti");
    }
}
