package JavaMethot;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // bir sayının tekmi çift mi olduğunu yazdırınız.
        sayiTekMiCiftMi(50);
        okuTekMiCiftMiYaz();
    }
    public static void sayiTekMiCiftMi(int number){

      if (number%2==0){
          System.out.println(number+" Çift sayıdır");
      }else
          System.out.println(number+" Tek sayıdır");

    }
public static void okuTekMiCiftMiYaz(){
    System.out.print("Sayı giriniz: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    sayiTekMiCiftMi(number);

}
}
