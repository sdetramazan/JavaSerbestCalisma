package Soru_05;

import java.util.Scanner;

public class _04_Soru {
    public static void main (String [] args){
        // Kullanıcıdan sayı isteyiniz.
        // Bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın.

        Scanner input = new Scanner(System.in);
        int number=0;
        int toplam=0;

        for (int i = 0; i < 6; i++) {

            System.out.print("sayı giriniz= ");
            number= input.nextInt();

            if (number>6 && number<10)
                continue;
                toplam=toplam+number;
            System.out.println("continue çalışmadı");
        }
        System.out.println("toplam = " + toplam);
    }
}
