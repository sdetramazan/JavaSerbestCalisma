package Soru_05;

public class _11_Soru {
    public static void main (String[] args){
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *        1.Satırda 1 yıldız
        // **       2.satırda 2 yıldız
        // ***      3.satırda 3 yıldız
        // ****     4.satırda 4 yıldız
        // *****    5.satırda 5 yıldız

        int n =6;
        for (int i = 1; i <=5; i++) {
            for (int j =1 ; j <=(n-i) ; j++) {
                System.out.print(" ");


            }
            for (int k = 1; k <=((2*i)-1) ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
