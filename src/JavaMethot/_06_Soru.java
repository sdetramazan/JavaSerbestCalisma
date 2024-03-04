package JavaMethot;

import java.util.Scanner;

public class _06_Soru {
   /* Soru1- Ismi "randomNum" olan bir method oluşturun.
    Parametresi "int max" olmalı.
    Bu method, 0 ile max arasında random bir değer döndürmelidir.
    Random numarayı döndüren programı yazınız.*/
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Sayı giriniz: ");
       int number= input.nextInt();
       System.out.println(randomNum(number));
   }


    public static int randomNum(int max){
            int random=(int) (Math.random()*max);
            return random;
    }

}
