package JavaMethot;

import java.util.Scanner;

public class _06_Soru {
   /* Soru1- Ismi "randomNum" olan bir method oluşturun.
    Parametresi "int max" olmalı.
    Bu method, 0 ile max arasında random bir değer döndürmelidir.
    Random numarayı döndüren programı yazınız.*/
  public static void main (String[] args){
      randomNumber(userNumberEntry());
  }

    public static int randomNumber(int max){
        int randomNmbr=(int) (Math.random()*max);
        System.out.print("Ramdom sayı: "+randomNmbr);
        return randomNmbr;
    }

    public static int userNumberEntry(){
        Scanner input = new Scanner(System.in);
        System.out.print("Max sayıyı giriniz: ");
         return input.nextInt();
    }

}
