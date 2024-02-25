package Mini_Projeler;

import java.util.Arrays;
import java.util.Scanner;

public class _02_KalinveinceSesliHarf {
    public static void main (String[] args) {
        //Kullanıcının gireceği bir harfin kalın ya da ince harf olduğunu bulan programı yapalım
        // ince harfler = a,ı,o,u
        // kalın harfler =e,i,ö,ü
        Scanner input = new Scanner(System.in);
        System.out.print("Harf giriniz: ");
        String letter = input.next();


        String[] boldLetter = {"a", "ı", "o", "u"};
        String[] smallLetter = {"e", "i", "ö", "ü"};

        for (int i = 0; i < boldLetter.length; i++) {
            if (boldLetter[i].equalsIgnoreCase(letter)) {
                System.out.println(boldLetter[i] + " kalın sesli harftir.");
            }
        }
        for (int j = 0; j < smallLetter.length; j++) {
            if (smallLetter[j].equalsIgnoreCase(letter)) {
                System.out.println(smallLetter[j] + " ince sesli harftir.");
            }
        }

    }}









