package JavaMethot;

import java.util.Scanner;

public class _08_Soru {
    //Soru3-reverseString isminde bir method oluşturun.
    //Bu method bir String'i parametre olarak almalı.
    //Method, girilen String'i tersten ekrana yazdıran programı yazınız.
    //Örnek girdi: "Java'yı Seviyorum."
    //Çıktı: ".muroyiveS ıy'avaJ"
    public static void main(String[] args){
        reverseString(userSentenceEntry());
    }

    public static char reverseString(String sentence){

        char reverse=' ';
        for (int i = 0; i < sentence.length(); i++) {
            reverse=sentence.charAt((sentence.length()-1)-i);
            System.out.print(reverse);
        }

        return reverse;
    }

    public static String userSentenceEntry(){
        Scanner input = new Scanner(System.in);
        System.out.print("cümle giriniz: ");
        return input.nextLine();
    }



}
