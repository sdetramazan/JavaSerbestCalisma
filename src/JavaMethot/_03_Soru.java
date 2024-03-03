package JavaMethot;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Soru {
    // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
    // dizinin en küçük, en büyük elemanını ve
    // ortalamasını ayrı fonksiyonlarda bulup yazdırınız
    public static void main(String[] args) {

        int[] values = new int[5];
        for (int i = 0; i < values.length; i++) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        values[i]= input.nextInt();
    }
        Arrays.toString(values);
        minNumber(values);
        maxNumber(values);
        average(values);
    }


    public static void minNumber(int[] minNbr){
        Arrays.sort(minNbr);
        System.out.println("En küçük sayı: "+minNbr[0]);

    }

    public static void maxNumber(int[] maxNbr){
        Arrays.sort(maxNbr);
        System.out.println("En büyük sayı: "+ maxNbr[maxNbr.length-1]);
    }

    public static void average(int[] averageNbr){
            double total=0;
            double average=0;

        for (int i = 0; i < averageNbr.length ; i++) {
            total+=averageNbr[i];
        }
        System.out.println("Ortalama: "+total/averageNbr.length);

    }

}