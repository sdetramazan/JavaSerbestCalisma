package Soru_07;

import java.util.Arrays;
import java.util.Scanner;

public class _10_Soru {
    public static void main (String[] args){
        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.

        Scanner input = new Scanner(System.in);
        int[] values= new int[10];

        for (int i = 0; i < values.length ; i++) {
            values[i]=(int) (Math.random()*20);
        }
        System.out.println(Arrays.toString(values));

        Arrays.sort(values);// dizi içindeki değerleri sıralar
        System.out.println(Arrays.toString(values));

        System.out.print("Aranacak rakamı gir : ");
        int wanted= input.nextInt();

        int fundIndex=Arrays.binarySearch(values,wanted);//aranan sayının dizideki indexini verir.

        if (fundIndex>0){
            System.out.println("Aranan sayı dizide bulunmaktadır. bu sayının indexi = " + fundIndex);
        }else
        {
            System.out.println(wanted+" sayısı dizide bulunmamaktadır.");
        }


    }
}
