package JavaMethot;

import java.util.Scanner;

public class _08_Soru {
    //Soru3-reverseString isminde bir method oluşturun.
    //Bu method bir String'i parametre olarak almalı.
    //Method, girilen String'i tersten ekrana yazdıran programı yazınız.
    //Örnek girdi: "Java'yı Seviyorum."
    //Çıktı: ".muroyiveS ıy'avaJ"

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cümle giriniz: ");
        String cumle = input.nextLine();
        reverseString(cumle);

    }

    public static void reverseString(String cumle){
        for (int i = 0; i <cumle.length(); i++) {
         int ters= cumle.length()-i-1;
            System.out.print(cumle.charAt(ters));

        }
    }
}
