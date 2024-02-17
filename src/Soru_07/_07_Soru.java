package Soru_07;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        // örn: Bu gun hava cok guzel -> 5

        Scanner input = new Scanner(System.in);
        System.out.print("Cümle giriniz: ");
        String sentence =input.nextLine();

        String[] words=sentence.split(" ");
        System.out.println("kelime sayısı = " + words.length);

        for (int i = 0; i < words.length; i++) {
            System.out.println(i+1+". kelime = " + words[i]);
        }
    }
}
