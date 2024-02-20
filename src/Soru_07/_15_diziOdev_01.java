package Soru_07;

import java.util.Arrays;
import java.util.Scanner;

public class _15_diziOdev_01 {
    public static void main(String[] args) {
        soru09();

    }

    public static void soru01() {
        //Soru1- Verilen String'i oluşturun ve String'deki kelime sayısını yazdıran programı yazınız.
        //        "Removes white space from both ends of a string".

        String sentence = "Removes white space from both ends of a string";
        String[] words = sentence.split(" ");
        System.out.println("Kelime sayısı : " + words.length);
    }

    public static void soru02() {
        //Soru2- Bir String oluşturun ve bu Stringi tersten yazdıran programı yazdırınız.
        //       Örnek String: "Hello World"
        // Çıktı : "dlroW olleH"
        String sentence = "Hello word";
        System.out.println(sentence);
        int count = sentence.length();
        for (int i = 0; i < count; i++) {
            char charstr = sentence.charAt(count - i - 1);
            System.out.print(charstr);

        }
    }

    public static void soru03() {
        //Soru3- 5 elemanlı int Array oluşturun ve elemanların toplamını yazdıran programı yazınız.
        // Örnek: 25,30,30,35,100
        //Çıktı: 220 olmalı.

        int[] number = {25, 30, 30, 35, 100};
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            total = number[i] + total;
        }
        System.out.println("Kullanıcı girişsiz toplam="+total);

        // kullanıcıdan alarak
        Scanner input = new Scanner(System.in);
        int[] number2 = new int[5];
        int total2 = 0;
        for (int i = 0; i < number2.length; i++) {
            System.out.print(i + 1 + ". sayıyı giriniz: ");
            number2[i] = input.nextInt();
            total2 += number2[i];
        }
        System.out.print("kullanıcı girişli toplam= "+total2);
    }
    public static void soru04(){
        //Soru4- 5 elemanlı int Array oluşturun ve elemanları ekrana yazdıran programı yazınız.
          //      Örnek elemanlar : 13, 15,14,16,16.

        int[] values={13, 15,14,16,16};
        System.out.println(Arrays.toString(values));

        //Kullanıcıdan alarak
        Scanner input = new Scanner(System.in);
        int[] values01= new int[5];

        for (int i = 0; i < values01.length; i++) {
            System.out.print(i+1+". sayıyı giriniz: ");
            values01[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(values));
    }
    public static void soru05(){
      /*  Soru5- String array oluşturun ve Arrayda ki eleman sayısını yazdıran programı yazınız.
        Girdi: "new jersey" , "new york", "boston","California"
        Çıktı: 4 olmalı.*/

        String[] values={"new jersey" , "new york", "boston","California"};

        System.out.println(values.length);

    }
    public static void soru06(){
        /*Soru6- String Array oluşturunuz ve tüm elemanları ekrana yazdıran programı yazınız.
                Örnek elemanlar: Apple, Orange , Banana, Kiwi.*/
        String[] values ={"Apple, Orange, Banana, Kiwi,"};

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            System.out.println();
        }
        Scanner input = new Scanner(System.in);
        String[] values01=new String[5];

        for (int i = 0; i < values01.length; i++) {
            System.out.print("Meyve adı giriniz:");
            values01[i]=input.nextLine();

        }
        System.out.println(Arrays.toString(values01));
        for (int i = 0; i < values01.length; i++) {
            System.out.println(values01[i]);

        }
    }
    public static void soru07(){
   // Soru7- 6 elemanlı int Array oluşturun ve elemanların ortalamasını ekrana yazdıran programı
    //yazınız. Örnek elemanlar: 12, 14 , 21 ,23 , 10 ,4

        int[] number={12,14,21,23,10,4};



        //int[] number = new int[6];
        int total=0;
        double average=0;
        for (int i = 0; i < number.length; i++) {
           // number[i]=(int) (Math.random()*24);
            total+=number[i];

        }
        System.out.println(Arrays.toString(number));
        average=total/ number.length;
        System.out.println("ortalama: "+average);
}
  public static void soru08() {
   /* Soru8- int Array oluşturun ve elemanlar çift ise toplayan tek ise çıkaran işlemi yazdıran
    programı yazınız.
    Girdi: 5,6,8,12,14,19
    Çıktı: -5 + 6 + 8 + 12 + 14 - 19 = 16*/

      int[] values ={-7 + 6 + 8 + 12 + 14 - 19};
        int total=0;
        int exraction=0;
      for (int i = 0; i < values.length; i++) {
          if (values[i]%2==0){
              total+=values[i];

          } else if (values[i]%2==1) {
              exraction-=values[i];
          }

      }
      System.out.println("Sonuç :"+(total+exraction));

  }
  public static void soru09(){
     /* Soru9- 5 elemanlı int Array oluşturun ve elemanların içindeki en büyük 2. elemanı yazdıran
      programı yazınız.
      Girdi: 15 , 25, 22, 18, 30
      Çıktı: 25*/

      int[] values ={15 , 25, 22, 18, 30};

     Arrays.sort(values);
           System.out.println(values[(values.length)-2]);
  }
}