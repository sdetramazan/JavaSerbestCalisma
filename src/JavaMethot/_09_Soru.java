package JavaMethot;

import java.util.Arrays;
import java.util.Scanner;

public class _09_Soru {
    //Soru4- "reverseWord" olan bir method oluşturun.
    //Bu method bir String'i parametre olarak almalı.
    //Bu cümledeki kelimeleri tersten yazdıran programı yazınız
    //Örnek girdi: "Java yazın"
    //Çıktı: "yazın Java"

    public static void main(String[] args) {
        //String cumle ="Java yazın";

       reverseWord(word());

    }

    public static void reverseWord(String cumle){
        String[] kelime =cumle.split(" ");
        for (int i = 1; i <= kelime.length; i++) {
            System.out.print(kelime[kelime.length-i]+" ");

        }
        }
        public static String word(){
        Scanner input = new Scanner(System.in);
            System.out.print("Cümle giriniz: ");
            return input.nextLine();


        }
        }



