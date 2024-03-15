package JavaArrayList;

import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _03_Soru {
        // Soru 1:
    // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
    // her bir satıra yazdırınız
    // Matematik : 50 70 80
    // Fizik : 30 40
    // Kimya : 60 70 80 90
    public static void main(String[] args) {

        ArrayList<String> dersler = new ArrayList<>(Arrays.asList("Matematik", "Fizik", "Kimya"));
        ArrayList<Integer> matematik = new ArrayList<>(Arrays.asList(50, 70, 80));
        ArrayList<Integer> fizik = new ArrayList<>(Arrays.asList(30, 40));
        ArrayList<Integer> kimya = new ArrayList<>(Arrays.asList(60, 70, 80, 90));

        ArrayList<ArrayList<Integer>> tumNotlar = new ArrayList<>();
        Collections.addAll(tumNotlar, matematik);
        Collections.addAll(tumNotlar, fizik);
        Collections.addAll(tumNotlar, kimya);

        for (int i = 0; i < dersler.size(); i++) {
            System.out.print(dersler.get(i) + "=\t");
            for (int j = 0; j < tumNotlar.get(i).size(); j++) {
                System.out.print(tumNotlar.get(i).get(j) + " ");
            }
            System.out.println();
        }


        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  notunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.
        System.out.println("Dersler\n 0-Matematik\n 1-Fizik\n 2-Kimya");
        Scanner input = new Scanner(System.in);
        System.out.print("Ders seçiniz:");
        int ders = input.nextInt();

        for (int i = 0; i < tumNotlar.get(ders).size(); i++) {
            System.out.print(tumNotlar.get(ders).get(i) + "\t");

        }
        System.out.println();

        // TODO
        // Soru 3 :
        // Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.
        ortalamaYaz(ders,tumNotlar);
    }
    public static void ortalamaYaz(int ders, ArrayList<ArrayList<Integer>> tumNotlar){
        int total=0;
        int ortalama=0;
        int gecen=0;

        for (int i = 0; i < tumNotlar.get(ders).size(); i++) {

            int not = tumNotlar.get(ders).get(i);
            total+=not;
            if (not>=50){
                gecen++;
            }

        }
        ortalama=total/tumNotlar.get(ders).size();
        System.out.println("Dersi gecen = " + gecen+" kişi");
        System.out.println("Ortalama = " + ortalama);

    }
}


