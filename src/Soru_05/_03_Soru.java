package Soru_05;

public class _03_Soru {
    public static void main (String[] args){
        // 2 ler çarpım tablosunu , aşağıdaki şekilde olarak yazdırınız.
        //    2 x 1 = 2
        //    2 x 2 = 4
        //    2 x 3 = 6
        //    2 x 4 = 8
        //    2 x 5 = 10
        //    2 x 6 = 12
        //    2 x 7 = 14
        //    2 x 8 = 16
        //    2 x 9 = 18
        //    2 x 10 = 20
        int carpim=1;
        for (int i = 1; i <=10 ; i++) {
            carpim=2*i;
            System.out.println("2 x "+i+" = "+carpim);


        }


    }
}
