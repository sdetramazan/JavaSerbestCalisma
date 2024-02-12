package Soru;

public class _21_Soru {
    public static void main (String[] args){
        
        
        int satirSayisi=8;

        for (int i = 0; i <satirSayisi ; i++) {
            for (int j = 0; j <satirSayisi-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(2*i+1) ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = 0; i <satirSayisi-1 ; i++) {
            for (int j = 0; j < i+2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(satirSayisi-(i+1))-1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        
    }
}
