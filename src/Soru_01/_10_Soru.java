package Soru_01;

import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        //yan yana aralarında bir boşlukla girilen 2 int sayının
        //birbirine eşit olup olmadığını bulun
        //45 67

        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı gir=");
        String sayiStr=scanner.nextLine();

        int bosluk = sayiStr.indexOf(" ");

        String sayi1 =sayiStr.substring(0,bosluk);
        String sayi2=sayiStr.substring(bosluk+1);

        int sayiInt = Integer.parseInt(sayi1);
        int sayi1Int=Integer.parseInt(sayi2);
        if (sayiInt==sayi1Int){
            System.out.println("birbirine eşit");
        }else
            System.out.println("birbirine eşit değildir");
    }
}
