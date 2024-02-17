package Soru_07;

import java.util.Arrays;

public class _09_ArraysMethode {
    public static void main(String[] args) {

        String[] nouns = {"raki", "Bet", "Eba", "Mir"};

        System.out.println("isimler : " + Arrays.toString(nouns));//String tipindeki diziyi yazdırma

        for (int i = 0; i < nouns.length; i++) { //for i ile String tipindeki diziyi yazdırma
            System.out.println(i + 1 + ". isim= " + nouns[i]);
        }
        int[] a = {7, 2, 8, 4};
        System.out.println("Sayılar =" + Arrays.toString(a));//int tipindeki diziyi yazdırma
        for (int i = 0; i < a.length; i++) {// for i ile int tipindeki diziyi yazdırma
            System.out.print(a[i] + ",");

        }
        System.out.println("**********************");

        Arrays.sort(a);// diziyi sıralama
        System.out.println("a dizisinin sıralaması: " + Arrays.toString(a));

        System.out.println("***********************");
        int[] b = {1, 8, 3, 54};
        int[] c = {1, 3, 8, 54};
        System.out.println(Arrays.equals(a, b));//dizilerin eşitlik kontrolü için true/false değeri verir
        System.out.println("b ve c dizilerini sıralamadan önce eşitlik kontrolü: " + Arrays.equals(b, c));

        Arrays.sort(b);
        Arrays.sort(c);
        System.out.println("b ve c dizilerini sıraladıktan sonra eşitlik kontrolü: " + Arrays.equals(c, b));

        System.out.println("******************");
        // contais gibi çalışır, var ise pozitif sayı veriri, yok ise negatif
        // sadece sıralı dizilerde çalışır

        System.out.println(Arrays.binarySearch(a, 3));// dizide 3 olmadığından negatif değer verdi
        System.out.println(Arrays.binarySearch(c, 3)+"\n **********");//dizide 3 olduğundan pozitif değer verdi.


        // Diziyi hızlıca doldurmak bir değer ile
        System.out.println("Değişiklik öncesi a dizisi: "+Arrays.toString(a));
        Arrays.fill(a,5);
        System.out.println("Değişiklik sonrası a dizisi : "+Arrays.toString(a));
    }
}
