package Soru;

import java.util.Scanner;

public class _11_Soru {
    public static void main (String [] args){
        //Kullanıcıdan ağırlıını double, boyunu doubel olarak alınız.
        // ve bir satırda boyunu.. ve kilonuz... kşeklinde yazınız.
        //vucut kitle indexini de bularak yazdırınız kg/(boy*boy)

        Scanner scanner =new Scanner(System.in);

        System.out.print("Kilonuzu girin =");
        double kilo =scanner.nextDouble();

        System.out.print("Boyunuzu Giriniz = ");
        double boy = scanner.nextDouble();

        double kitleIndex=kilo/(boy*boy);

        System.out.println("kilonuz =" +kilo + "boy =" +boy);
        System.out.println("kitleIndex = " + kitleIndex);

    }
}
