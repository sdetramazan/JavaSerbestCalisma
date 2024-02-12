package Soru_01;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //Girilen yeni bir  password un kurallara uygunluğunu kontrol ediniz.
        //kurallar:
        //1. en az 8 karakter olmalı
        //2. içinde pass kelimesi olmamalı(büyük/küçük)
        //3. en fazla 12 karakter olmalı

        Scanner scanner = new Scanner(System.in);
        System.out.print("Password giriniz = ");
        String passWord=scanner.next();

        if (passWord.length()>=8 && !passWord.toLowerCase().contains("pass") && passWord.length()<13){
            System.out.println("uygun şifre");
        }else
            System.out.println("girilen şifre uygun değildir.");
    }
}
