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
       reverseWord(userSentenceEntry());
    }
    public static String reverseWord(String sentence){
       String[] words= sentence.split(" ");
       String word="";

        for (int i = 0; i < words.length; i++) {
         word= words[(words.length-1)-i];
            System.out.print(word+" ");
        }
        return word;
    }

    public static String userSentenceEntry(){
        Scanner input = new Scanner(System.in);
        System.out.print("Cümle giriniz: ");
        return input.nextLine();
    }


        }



