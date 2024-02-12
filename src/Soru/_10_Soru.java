package Soru;

import java.util.Scanner;

public class _10_Soru {
    public static void main (String[] args){
        // bir dikdörtgenin gerekli kenar(int) uzunluklarını kullanıcıdan
        // isteyip çeresini ve alanını bulunuz ve yazdırınız.
        // cevre = (a+b)*2
        // alan = a*b

        Scanner scanner =new Scanner(System.in);
        System.out.print("Kısa Kenar ölçüsü = ");
        int kisaKenar=scanner.nextInt();

        System.out.print("Uzun Kenar Ölçüsü = ");
        int uzunKenar = scanner.nextInt();

        int cevre =(kisaKenar+uzunKenar)*2;
        int alan =kisaKenar*uzunKenar;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);

    }
}
