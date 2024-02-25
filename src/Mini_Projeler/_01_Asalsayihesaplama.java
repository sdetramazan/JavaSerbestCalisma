package Mini_Projeler;

import java.util.Scanner;

public class _01_Asalsayihesaplama {
    public static void main(String[] args) {
        //Kullanıcının gireceği sayının Asal sayı olup olmadığını bulan program yapınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();

        if ((number < 2)) {
            System.out.println("2 den küçük sayı girilemez");
            return;
        }

        if (number == 2) {
            System.out.println(number + " çift asal sayıdır");
            return;
        }
        for (int i = 1; i < number; i++) {

            int value = number % (number - i);
            if (value == 0) {
                System.out.println(number + " asal sayı değil .");
                break;
            }
            if (number == (i + 2) && (value > 0)) {

                System.out.println(number + " asal sayı ");
                break;
            }
        }
    }
}



