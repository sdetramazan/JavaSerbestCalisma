package Soru;

import java.util.Scanner;

public class _16_Soru {
    public static void main (String[] arg){

       /* 1-**I love java** olan bir String oluşturun.
        Bu cümlenin toplam karakter sayısını yazdırın.

        String cumle="I love java";        
        int uzunluk = cumle.length();
        System.out.println("karakter sayısı  = " + uzunluk);/*

       /* 2-**Sprint planning** olan bir String oluşturun.
        Bu dizenin _toplam karakter sayısını_ yazdırın.
        String cumle1="Sprint planning";
        int karakter = cumle1.length();
        System.out.println("karakter = " + karakter);*/
        


        /*3-**apple** olan bir String oluşturun.
        String'in _içinde_ **app** olup olmadığını **doğrula**.

       String kelime1="apple";
       boolean varMi = kelime1.contains("app");
        System.out.println("varMi = " + varMi);*/


        /* 4-**orange** kelimesinden oluşan bir String oluşturun.
                String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.
        String kelime2 ="orange";
        boolean esitMi = kelime2.contains("Apple");
        System.out.println("esitMi = " + esitMi);*/
        
         /*  5-**apple**  olan  bir String oluşturun.
        String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
                _Büyük harf veya küçük harf önemli değildir._
        String kelime3="Apple";
        boolean esitMi=kelime3.toLowerCase().equals("apple");
        System.out.println("esitMi = " + esitMi);*/

    /*    6-**Florida** kelimesinden bir String oluşturun.
        Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.
        String kalime4="Florida";
        int harf =kalime4.indexOf("o");
        System.out.println("harf = " + harf);*/
     
      /*  7-**Thank you** olan bir String oluşturun.
        Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.
        String cumle3= "Thank you";
        int konum = cumle3.indexOf("y");
        System.out.println("y harfi = " + konum+". indekstedir");*/

        /* 8-**Mouse** değerinde bir String oluştur.
        Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.
        String kelime5= "Mouse";
        char harf =kelime5.charAt(2);
        System.out.println("3. sıradaki karakter = " + harf);*/

        /*9-**paper** olan bir String oluşturun.
        String'i _büyük harfe_ çevirin ve yazdırın.
        örn: apple > APPLE
        String kelime6="paper";
        System.out.println("kelime6.toUpperCase() = " + kelime6.toUpperCase());*/

      /*  10-**OraNge** olan bir String oluşturun.
        String'i _küçük harfe_ çevirin ve yazdırın.
        örn: APPLE > apple
        String kelime7="OraNge";
        System.out.println("kelime7.toLowerCase() = " + kelime7.toLowerCase());*/

       /* 11-**New Jersey** olan bir String oluşturun.
        String'i _büyük harfe_ çevirin ve yazdırın
        String cumle5= "New Jersey";
        System.out.println("cumle5.toUpperCase() = " + cumle5.toUpperCase());*/

     /*   12-**New York** olan bir String oluşturun.
        String'i _küçük harfe_ çevirin ve yazdırın.
                
        String cumle7="New York";
        System.out.println("cumle7.toLowerCase() = " + cumle7.toLowerCase());*/

     /*   13-**PADDLE** olan bir String oluşturun.
        String'i _küçük harfe_ çevirin ve yazdırın.
        
        String kelime9="PADDLE";
        System.out.println("kelime9.toLowerCase() = " + kelime9.toLowerCase());*/



       /* 14- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("ad = ");
        String ad = scanner.nextLine();

        System.out.print("Soyad = ");
        String soyad = scanner.nextLine();

        System.out.println("Ad Soyad = " + ad +" "+ soyad);
        System.out.println("ad soyad = " + ad.concat(" "+soyad));*/


       /* 15- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

       Scanner scanner = new Scanner(System.in);
        System.out.print("kelime = ");
        String kelime = scanner.nextLine();

        boolean bosMu = kelime.isEmpty();
        System.out.println("bosMu = " + bosMu);*/



      /*  16- Girilen bir kelimenin ilk ve son harfini bulunuz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime = ");
        String kelime=scanner.nextLine();
    System.out.print("ilk harf = "+kelime.charAt(0)+"\n ikinci harf = "+kelime.charAt(kelime.length()-1));*/

      /*  17- tek seferde girilen 3 kelimelik ismi,        ad , 2.ad ve soyadını      A.E.Y. şeklinde yazınız.

        mesala : Mehmet Alı Yılmaz -> M.A.Y

        Scanner scanner = new Scanner(System.in);
        System.out.print("isim Soyisim = ");
        String ad = scanner.nextLine();


        int bosluk = ad.indexOf(" ");
        int bosluk2=ad.lastIndexOf(" ");

        char ad1 = ad.charAt(0);
        char ad2 =ad.charAt(bosluk+1);
        char soyad = ad.charAt(bosluk2+1);

        System.out.println(ad1+"."+ad2+"."+soyad+".");*/



       /* 18- tek seferde girilen 3 kelimelik ismi,        ad , 2.ad ve soyadını     ayrı ayrı yazdırınız.

        mesala : Mehmet Alı Yılmaz -> Mehmet  i  Ali  yi ve Yılmaz ı ayrı ayrı yazdırınız.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("isim Soyisim = ");
        String ad = scanner.nextLine();


        int bosluk = ad.indexOf(" ");
        int bosluk2=ad.lastIndexOf(" ");

        String ad1 = ad.substring(0,bosluk);
        String ad2 =ad.substring((bosluk+1),bosluk2);
        String soyad = ad.substring(bosluk2+1);

        System.out.println(ad1+"\n"+ad2+"\n"+soyad);

    }
}
