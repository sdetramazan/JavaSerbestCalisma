package Enum.Soru_03;

public class AylarMain {
    public static void main(String[] args) {
        Aylar ay =Aylar.TEMMUZ;

        System.out.println("ay = " + ay);
        System.out.println("ay.ayAd = " + ay.ayAd);
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);

        for (Aylar aylar:Aylar.values()) {
            System.out.println(aylar.ayAd+" ayların "+aylar.ayNo+". ayı ve "+aylar.gunMiktar+" günü var. \n");

        }
    }
}
