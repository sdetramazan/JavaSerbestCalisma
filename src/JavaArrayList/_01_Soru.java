package JavaArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _01_Soru {
    // // Kullanıcıdan alacağınız sayılarla dolduracağınız 6 elemanlı(sayı) bir dizinin
    //        // sadece tek sayı olan elemanlarını ayrı diziye(liste)(ArrayList) atayarak
    //        // yazdırınız.

   public static void main(String[] args) {

     addToArray(6);

       /* Scanner input = new Scanner(System.in);
        ArrayList<Integer> oddNumbers= new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.print("Sayı giriniz: ");
            int number = input.nextInt();
            if (number%2!=0){
                oddNumbers.add(number);
            }
        }
        System.out.println(oddNumbers);
    }*/
   }
    public static int userNumberEntry(){
        Scanner input = new Scanner(System.in);
        System.out.print("sayı Giriniz: ");
        return input.nextInt();
    }
    public static ArrayList<Integer> addToArray(int amountArray){
        ArrayList<Integer> oddToNumbers = new ArrayList<>();
        ArrayList<Integer> number=  fillTheArray(amountArray);
              for (int i = 0; i < amountArray; i++) {
                      if (number.get(i)%2==1){
                oddToNumbers.add(number.get(i));
                }
              }
        System.out.println(oddToNumbers);

              return oddToNumbers;
        }
        public static ArrayList<Integer> fillTheArray(int amountArray){
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < amountArray; i++) {
            int number=userNumberEntry();
            numbers.add(number); }
            System.out.println(numbers);
            return numbers;
        }

    }

