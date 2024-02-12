package Soru_02;

import java.util.Scanner;

public class _07_Soru {
    public static void main (String [] args){
//switch ile çözünüz
        //Girilen 2 tamsayıyı kullanıcıdan aldıktan sonra,
        //Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullnıcıdan alarak isteğe uygun olan
        //işlemi yaptırıp sonucu yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir= ");
        int count = scanner.nextInt();

        System.out.print("sayı gir= ");
        int count1= scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("işlem seç (T-Ç-P-B)= ");
        String islem =scanner1.next();

        switch (islem.toUpperCase()){
            case "T" : System.out.print("toplam= " +(count+count1)); break;
            case "Ç" : System.out.print("fark= " +(count-count1)); break;
            case "P" : System.out.print("çarpım= " +(count*count1)); break;
            case "B" : System.out.print("bolüm= " +(count/(double)count1)); break;
            default:
                System.out.println("hatalı giriş");

        }




    }
}
