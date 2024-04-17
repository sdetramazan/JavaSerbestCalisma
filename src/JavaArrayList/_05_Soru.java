package JavaArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
        // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
        // diziye atınız.

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random()*11));
        }
        System.out.println("ArrayList tekrarlı: "+numbers);
        HashSet<Integer> newNumbers = new HashSet<>();
        for (int num: numbers) {
         newNumbers.add(num);
    }
        System.out.println("HashSet tekrarsız: "+newNumbers);
    }

}
