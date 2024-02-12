package Soru_04;

import java.util.Scanner;

public class _04_Soru {
   /* public static void main(String[] args){
        //kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz
        Scanner input = new Scanner(System.in);
        int number =1;
        int total =0;

        while (number!=0){
            System.out.print("sayı giriniz= ");
            number= input.nextInt();
            total+=number;



        }
        System.out.println("total = " + total);

    }*/
    public static void main (String[] args){
        //kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz
        Scanner input = new Scanner(System.in);
        int number =1;
        int total =0;

      do{
            System.out.print("sayı giriniz= ");
            number= input.nextInt();
            total+=number;




        }  while (number!=0);
        System.out.println("totalüe = " + total);

    }

}
