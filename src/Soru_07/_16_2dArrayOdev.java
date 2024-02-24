package Soru_07;

import java.util.Arrays;

public class _16_2dArrayOdev {
    public static void main(String[] args) {
        soru03();

    }
    public static void soru01(){
       /* Soru1-Örnekte verilen 2D int Array'i oluşturunuz. Verilen bütün 2'leri 6'yla değiştiren ve
        ekrana yazdıran programı yazınız
        Örnek Array:[{2,3,2} , {4,1,5} , {7,2,5}]*/

        int[][] values ={{2,3,2} , {4,1,5} , {7,2,5}};

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j]==2){
                    values[i][j]=6;
                    System.out.print(values[i][j]);
                    continue;
                }
                System.out.print(values[i][j]);
            }
            System.out.println();
        }
    }
    public static void soru02(){
        //Soru2-Örnekte verilen 2D int Array'i oluşturunuz. 2D array'de verilen elemanları toplamını
        //bulan programı yazınız.
        //Örnek Array:[{5,2,1} , {10,2,3,6} , {1,2}]
        //Sonuç 32 olmalıdır.

        int[][] values = {{5,2,1} , {10,2,3,6} , {1,2}};
        int total=0;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
              total+=values[i][j];
            }

        }
        System.out.println("total = " + total);
    }
    public static void soru03(){
        //Soru3-Örnekte verilen 2D String Array'i oluşturunuz. Verilen Bütün ohio'ları Florida'yla değiştiren
        //ve ekrana yazdıran programı yazınız
        //Örnek Array:
        //{"new jersey","atlanta","ohio"} ,{"Pittsburgh" ,"ohio","new york","ohio"} ,{"ohio","new york"}
        String[][] values ={{"new jersey","atlanta","ohio"} ,{"Pittsburgh" ,"ohio","new york","ohio"} ,{"ohio","new york"}};

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if ((values[i][j].equalsIgnoreCase("ohio"))) {
                    values[i][j]="Florida";
                    System.out.println(values[i][j]);
                    continue;
                }
                System.out.println(values[i][j]);
            }
            System.out.println();
        }
    }
}
