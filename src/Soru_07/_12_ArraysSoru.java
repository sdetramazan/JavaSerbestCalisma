package Soru_07;

import java.util.Scanner;

public class _12_ArraysSoru {
    public static void main(String[] args) {
        // 2x3 lük bir tabloyu random 10 a kadar sayılarla doldurunuz.
        // Daha sonra kullanıcıdan bir sayı alınız.Bu sayı tabloda
        // var ise yerini (satir,sütun) yazdırınız.
        int[][] table = new int[2][3];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (int) (Math.random() * 10);
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {

                if (table[i][j] == number){

                    System.out.println("Girmiş olduğnuz sayının tablodaki indexi: " + i+""+j);}

            }


        }

    }

}

