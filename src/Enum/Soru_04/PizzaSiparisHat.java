package Enum.Soru_04;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();
int secim=0;
do {
    menu();
    System.out.println("Lütfen seçim yapın :");
    secim=input.nextInt();
    switch (secim){
        case 1:
            System.out.println("Kaç adet istersiniz :");
            int miktar = input.nextInt()

        ;break;
        case 2:siparisler.add(new Pizza(PizzaSize.MEDIUM));break;
        case 3:siparisler.add(new Pizza(PizzaSize.LARGE));break;


    }

}while (secim<4);
    }
    public static void menu(){
     System.out.println("Pizza çeşitleri :\n1-Small\n2-Medium\n3-Large\n4-Göster");

    }
}
