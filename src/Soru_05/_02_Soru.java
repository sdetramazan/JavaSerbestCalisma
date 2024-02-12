package Soru_05;

import java.util.Scanner;

public class _02_Soru {
    public static void main (String[] args){
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // bolum 2: carpimin degeri 10000 ü geçtiğinde işlem sonlansın.
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı gir : ");
        int number = input.nextInt();
        int carpim=1;
        for (int i = 1; i <=number ; i++) {
            carpim*=i;

        if (carpim>10000) {
            System.out.println("işlem bitti sonuç" + carpim);
            break;
        }
        }
        System.out.println("carpim = " + carpim);
    }
}
