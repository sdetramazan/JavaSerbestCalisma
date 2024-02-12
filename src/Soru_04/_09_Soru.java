package Soru_04;

public class _09_Soru {
    public static void main (String[] args){
        // 0 dan 100 e kadar olan çift sayıların toplamını bulunuz.
        // toplam 50 yi geçtiğinde , mesaj yazınız.(50 geçildi şeklinde)

        int total=0;
        for (int i = 0; i <=100 ; i+=2) {
            total += i;
        }
           if (total>50){

               System.out.println("Toplam 50 yi geçti "+total);
           }else {
               System.out.println("50 ye ulaşılmadı " +total);
           }


    }
}
