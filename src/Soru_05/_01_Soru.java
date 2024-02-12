package Soru_05;

public class _01_Soru {
    public static void main (String[] args){
        // 0 dan 100 e kadar olan çift sayıların toplamını bulunuz.
        // toplam 50 yi geçtiğinde , mesaj yazınız.(50 geçildi şeklinde)
        // ve döngüden çıksın
        int total=0;
        for (int i = 0; i <=100 ; i+=2) {
            total+=i;
            if (total>50){
                System.out.println("toplam 50 geçildi" +i);
                break;
            }

        }
        System.out.println("total = " + total);
    }
}
