package Soru_06;

public class _01_Soru {
    public static void main (String[] args){
     /*   *
         ***
        *****
       *******
      *********
       *******
        *****
         ***
          *
         */

      int n =5;

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i)-1; k++) {
                System.out.print("*");

            }

            System.out.println();

        }
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <(2*(n-i)-1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
