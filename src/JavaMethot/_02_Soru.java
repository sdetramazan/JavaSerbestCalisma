package JavaMethot;

import java.util.Arrays;

public class _02_Soru {
    // mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
    // göndererek random 100 e kadar olan sayılarla dodurunuz. ve aynı fonksiyonda
    // yazdırınız.
    public static void main(String[] args){
        int[] values =new int[20];
        randomNumber(values);


    }
    public static void randomNumber(int[] value){

        for (int i = 0; i < value.length ; i++) {
           value[i] =(int) (Math.random()*100);
            System.out.println(i+1+". sayı: "+ value[i]);

        }
        System.out.println(Arrays.toString(value));

    }
}
