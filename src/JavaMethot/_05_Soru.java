package JavaMethot;

import java.util.Scanner;

public class _05_Soru {
    // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
    // bir fonksiyonda buldurup mainden yazdırınız
    // Örn: 5 girildiyse -> 1*2*3*4*5 i bulmalısınız
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
       int number=input.nextInt();
        System.out.println(number+" faktoriyel eşittir "+factorial(number));
    }

    public static int factorial(int number){
        int result=1;
        for (int i = 1; i <= number; i++) {
            result*=i;
        }
        return result;
    }

}
