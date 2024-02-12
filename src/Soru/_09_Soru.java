package Soru;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args){
        // Bir karenin kenarını kullanıcıdan isteyip
        // karenin çeresinive alanını bulunuz ve yazdırını
        //cevre=a+a+a+a  alan=a*a

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kenar ölçüsü gir=");
        int kenar =scanner.nextInt();
        int cevre =kenar*4;
        int alan= kenar*kenar;

        System.out.println("alan= " + alan+"\nÇevre= " +cevre);


    }
}
