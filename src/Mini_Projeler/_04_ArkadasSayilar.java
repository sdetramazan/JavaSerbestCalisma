package Mini_Projeler;

import java.util.Scanner;

public class _04_ArkadasSayilar {
    public static void main (String[] args){
        //kullanıcının gireceği iki sayının arkadaş sayı olup olmadğını bulan programı yazınız
        //birinci sayının pozitif bölenlerinin toplamı ikinci sayıya, ikinci sayının pozitif bölenleri toplamı birinci sayıya eşit olan  iki sayı arkadaş sayıdır
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        int number = scanner.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        int number1=scanner.nextInt();
        int total=0;
        int total1=0;
        for (int i = 1; i < number; i++) {
            if (number%i==0){
                total+=i;
                }
        }
        for (int i = 1; i <number1 ; i++) {
            if (number1%i==0){
                total1+=i;
            }
        }
        if (number==total1&&number1==total){
            System.out.println(number+" ile "+number1+" arkadaş sayılardır.");
        }else
            System.out.println(number+" ile "+number1+" arkadaş sayılar değiller.");

    }
}
