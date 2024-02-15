package Soru_07;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        Scanner input = new Scanner(System.in);
        int[] number = new int[7];
        double average = 0;
        int total = 0;
        int counter = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.print(i + 1 + ". Sayıyı giriniz: ");
            number[i] = input.nextInt();
            total += number[i];

        }
        average = total / number.length;

        for (int i = 0; i < number.length; i++) {
            if (((number[i] % 2) != 0) && number[i] > average) {
                counter++;
            }

        }
        System.out.println("ortalamayı geçen tek sayılar miktarı: " + counter + " tanedir.");
    }
}
