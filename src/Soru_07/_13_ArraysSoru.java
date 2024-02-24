package Soru_07;

import java.util.Scanner;

public class _13_ArraysSoru {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        int[][] table = new int[3][2];


        int count=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print("Sayı giriniz: ");
                table[i][j] = input.nextInt();

                if (table[i][j] % 2 == 1) {
                     count++;
                }
            }
        }
        int[] oddNumber=new int[count];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j]%2!=0){
                    oddNumber[i]=table[i][j];
                    System.out.print(oddNumber[i]);
                }
            }

        }



    }



}

