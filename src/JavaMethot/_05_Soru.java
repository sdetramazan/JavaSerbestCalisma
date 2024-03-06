package JavaMethot;

import java.util.Scanner;

public class _05_Soru {
    // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
    // bir fonksiyonda buldurup mainden yazdırınız
    // Örn: 5 girildiyse -> 1*2*3*4*5 i bulmalısınız
    public static void main(String[] args) {
        factorial(userNumberEntry());

    }
    public static int factorial(int number){

        int factorial=1;

        for (int i = 0; i < number; i++) {
            factorial*=(number-i);
        }
        System.out.println(number+"!  = "+factorial);
        return factorial;
    }

    public static int userNumberEntry(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        return input.nextInt();
    }

}
