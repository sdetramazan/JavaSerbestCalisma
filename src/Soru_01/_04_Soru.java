package Soru_01;

import java.util.Scanner;

public class _04_Soru {
    public static void main (String[] args){
        // Girilen bir cümlede a harfinin geçip geçmediğini
        //bulunuz geçiyor ise EVET, geçmiyorr ise HAYIR yazdırınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("cümle girin = ");
        String cumle = scanner.nextLine();

        if (cumle.contains("a")){
            System.out.println("evet");
        }else
            System.out.println("Hayır");


    }
}
