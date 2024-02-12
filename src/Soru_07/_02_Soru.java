package Soru_07;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        //kaç not olduğunu bulunuz ve bunları yazdırınız,

        Scanner input = new Scanner(System.in);

        double[] not = new double[4];
        double total = 0;
        double average = 0;
        int sayac = 0;
        for (int i = 0; i < not.length; i++) {
            System.out.print(i + 1 + ". Öğrenci notu: ");
            not[i] = input.nextDouble();
            total += not[i];
        }

         average=total/ not.length;
        System.out.println("Sınıf not ortalaması = " + average);

        for (int i = 0; i < not.length; i++) {

            if (not[i]>average){
                sayac++;
                System.out.println("Ortalamayı geçen "+sayac+". öğrenci notu = " + not[i]);

            }

        }


        System.out.println("Ortalamayı geçen toplam öğrenci sayısı:  = " + sayac+" kişidir ");

    }
}