package Soru_03;

public class _04_Soru {
    public static void main (String [] args){
        //1den 100 e kadar olan sayıların toplamını bulunuz

        int sayac = 0;
        int toplam =0;

        while (sayac<100){
            toplam+=sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
