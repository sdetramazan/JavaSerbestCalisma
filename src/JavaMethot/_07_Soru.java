package JavaMethot;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    //Soru2-"OrtaKelime" isminde bir method oluşturun.
    //Bu method String'i parametre olarak almalı.
    //Cümle veya dizelerdeki ortada bulunan kelimeleri bulmalı.
    //Ortadaki kelimeyi return yapınız.
    //Örnek girdi: Ben Java'yı seviyorum.--> Çıktı : Java'yı
    //Örnek girdi:Java'yı kolayca öğreniyorum.--> Çıktı : kolayca
    public static void main (String[] args){
        ortaKelime(userSentenceEntry());
    }


    public static String ortaKelime(String sentence){

       String[] word= sentence.split(" ");
       String middleWord="";
        for (int i = 0; i < word.length; i++) {
            middleWord=word[(word.length-1)/2];
        }
        System.out.println("ortada olan kelime: "+middleWord);
        return middleWord;
    }


    public static String userSentenceEntry(){
        Scanner input = new Scanner(System.in);
        System.out.print("Cümle giriniz: ");
        return input.nextLine();
    }


}
