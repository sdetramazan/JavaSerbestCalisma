package Soru_07;

import java.util.Scanner;

public class _01_Soru {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        int[] dizi =new int[10];

        for (int i = 0; i < dizi.length ; i++) {
            System.out.print(i+1+". sayıyı giriniz: ");
            dizi[i]=input.nextInt();



        }
        for (int i = 0; i < dizi.length; i++) {


            System.out.println("dizi = " + dizi[i]);
        }

    }
}
