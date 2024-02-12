package Soru_02;

import java.util.Scanner;

public class _08_Soru {
public static void main (String[] args){
    // girilen bir sayınını birler basamağının değerini yazı ile yazdırınız.
    //234 -> birler basamağı -> dört

    Scanner scanner =new Scanner(System.in);
    System.out.print("sayı gir= ");
    int count = scanner.nextInt();

    int birlerBasamaki=count%10;

    switch (birlerBasamaki){

        case 0 : System.out.println("birler basamağı sıfır"); break;
        case 1 : System.out.println("birler basamağı bir"); break;
        case 2 : System.out.println("birler basamağı iki"); break;
        case 3 : System.out.println("birler basamağı üç"); break;
        case 4 : System.out.println("birler basamağı dört"); break;
        case 5 : System.out.println("birler basamağı beş"); break;
        case 6 : System.out.println("birler basamağı altı"); break;
        case 7 : System.out.println("birler basamağı yedi"); break;
        case 8 : System.out.println("birler basamağı sekiz"); break;
        case 9 : System.out.println("birler basamağı dokuz"); break;


    }
}
}
