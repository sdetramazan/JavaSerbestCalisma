package Soru_05;

public class _09_Soru {
    public static void main (String[] args){
        // Aşağıdaki görünümü tek yıldız kullanarak yazdırınız.
        //  ***** 1
        //  ***** 2
        //  ***** 3
        //  ***** 4
        //  ***** 5

        for (int i = 1; i <6; i++) {
        for (int j = 0; j < 5; j++)
            System.out.print("*");
            System.out.println(" "+i);

        }
    }
}
