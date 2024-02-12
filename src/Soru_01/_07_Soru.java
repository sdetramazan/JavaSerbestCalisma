package Soru_01;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // girilen bir stringin uzunlugu 10 dan büyükse ve string içinde
        //study" kelimesi geçiyorsa ekrana evet yazdırın değilse
        //hayır yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.print("String gir = ");
        String kelime = scanner.nextLine();

        if (kelime.length()>10 &&kelime.contains("study")){
            System.out.println("EVET");
        }else
            System.out.println("Hayır");
    }
}
