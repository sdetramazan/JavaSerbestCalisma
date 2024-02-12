package Soru_04;

import java.util.Scanner;

public class _08_Soru {
    public static void main (String [] args){
        // kullanıcının gireceği bir rakama(dahil) kadar
        // olan sayıların toplamını bulunuz.

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int number = input.nextInt();
        
        int total =0;

        for (int i = 0; i <=number ; i++) {
            
            total+=i;
            
        }
        System.out.println("total = " + total);
    }
}
