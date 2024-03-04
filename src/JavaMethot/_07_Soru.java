package JavaMethot;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    //oru2-"OrtaKelime" isminde bir method oluşturun.
    //Bu method String'i parametre olarak almalı.
    //Cümle veya dizelerdeki ortada bulunan kelimeleri bulmalı.
    //Ortadaki kelimeyi return yapınız.
    //Örnek girdi: Ben Java'yı seviyorum.--> Çıktı : Java'yı
    //Örnek girdi:Java'yı kolayca öğreniyorum.--> Çıktı : kolayca

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cümle giriniz: ");
        String sentence=input.nextLine();
        System.out.println(commonWord(sentence));
    }

    public static String commonWord(String sentence){

        String[] word= sentence.split(" ");
        int wordAmount = word.length;

         String middle = word[(wordAmount/2)];
        return middle;





    }
}
