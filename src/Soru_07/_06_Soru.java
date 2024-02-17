package Soru_07;

import java.util.Scanner;

public class _06_Soru {
    public static void main (String[] args){

        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        // örn: Bu gun hava cok guzel -> 5

        Scanner input = new Scanner(System.in);
        System.out.print("cümle giriniz: ");
        String words = input.nextLine();
        int spaceQuantity=0;

        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i)==' '){
                spaceQuantity++;
            }
        }
        System.out.println("Girilen cümlede bulunan boşluk sayısı = " + (spaceQuantity+1));

    }
}
