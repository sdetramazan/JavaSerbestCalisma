package Mini_Projeler;

import java.util.Arrays;
import java.util.Scanner;

public class _05_SayiBulmaca {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Aranacak sayıyı girin:");
        int[] numbers = {1,2,3,4};

        int search=scanner.nextInt();
        boolean isThere=false;

        for (int number:numbers ) {
            if (number==search){
                isThere=true;
                break;
            }
        }
             if (isThere)
              System.out.println("sayı bulundu");
             else
                 System.out.println("sayı bulunamadı");
            
        } }

