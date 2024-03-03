package JavaMethot;

import java.util.Scanner;

public class _04_Soru {
    // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
    // yaptıktan sonra main de yazdırınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number =new int[2];

        for (int i = 0; i < number.length ; i++) {
            System.out.print("Sayı giriniz: ");
            number[i]=input.nextInt();
        }

        System.out.print("en büyük: "+maxNumber(number));
    }
    public static int maxNumber(int[] maxNbr){
       int max=0;
        if (maxNbr[0]<maxNbr[1]) {
            max = maxNbr[1];
        } else{
            max=maxNbr[0];
            }
          return max;
        }
    }

