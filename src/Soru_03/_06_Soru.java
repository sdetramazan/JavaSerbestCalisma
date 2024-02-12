package Soru_03;

import java.util.Scanner;

public class _06_Soru {
    public static void main (String [] args){
       /* //1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz
        Scanner scanner =new Scanner(System.in);

        int sayac =0;
        int toplam =0;

        while (sayac<20){
            System.out.print(sayac+1+". sayıyı giriniz=");
            int sayi = scanner.nextInt();
            sayac++;
            if (!(sayi%2==0)){
                toplam+=sayi;
            }

        }
        System.out.println("toplam = " + toplam);*/

//2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz
       /* Scanner scanner = new Scanner(System.in);

        int sayac =0;
        int tek =0;

        while (sayac<20){
            System.out.print(+sayac+1+". sayıyı giriniz=");
            int sayi = scanner.nextInt();
            sayac++;

            if (!(sayi%2==0)){
                tek++;
            }
        }
        System.out.println("tek = " + tek);*/

        //3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("sayı gir= ");
        int sayi=scanner.nextInt();

        int sayac =0;
        int toplam=0;

        while (sayac<sayi){

            sayac++;
            toplam+=sayac;
        }
        System.out.println("toplam = " + toplam);*/

//4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

     /*   Scanner scanner = new Scanner(System.in);

        int sayac=0;
        int toplam=0;

        while (sayac<20){

            System.out.print(sayac+1+". sayıyı giriniz=");
            int sayi = scanner.nextInt();
            sayac++;

            if (sayi>10 && sayi<30){
                toplam+=sayi;
            }
        }
        System.out.println("Toplam= "+toplam);*/

        //100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

       /* int sayac =0;
        int birler=0;

        while (sayac<100){

            sayac++;
            if (sayac%10==5){
                birler++;
            }
        }
        System.out.println("birler = " + birler);*/

        //6- Bir sayı bulmaca oyunu yapılmak isteniyor
        //
        //    bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //
        //   Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //
        //   bilemediniz yazıp tutulan sayıyı bildirsin.
        //
        //   Eğer bilirse tebrikler yazsın.

      /*  Scanner scanner=new Scanner(System.in);
        
        int rndSayi= (int) (Math.random()*10+10);
        System.out.println("rndSayi = " + rndSayi);

        int sayac =1;

       do{
            System.out.print("Tahmin gir=");
            int tahmin = scanner.nextInt();

            if ((tahmin == rndSayi)){
             System.out.println("Tebrikler Bildiniz");
             break;
            } else if (sayac!=3) {
                System.out.println("Bilemediniz Tekrar deneyiniz");
            }else {
                System.out.println("bilemediniz tutulan sayı" +rndSayi);
            }
            sayac++;

       }while (sayac<=3);*/

        //Soru-7 Girilen 3 basamaklı bir sayının birler, onlar ve yüzler basamağını bulan programı   yazınız.

        /*Scanner input = new Scanner(System.in);
        System.out.print("3 basamaklı sayı giriniz= ");
        int sayi = input.nextInt();

      int basamak;
      int sayac=1;

      while (sayi>0){

          basamak=sayi%10;
          System.out.println(+sayac+" ler basamağı :"+basamak);
          sayi/=10;
          sayac*=10;


      }*/


//6- Bir sayı bulmaca oyunu yapılmak isteniyor
        //
        //    bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //
        //   Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //
        //   bilemediniz yazıp tutulan sayıyı bildirsin.
        //
        //   Eğer bilirse tebrikler yazsın.

       /* Scanner input = new Scanner(System.in);

        int rndSayi = (int) (Math.random()*(20-10)+10);
        System.out.println("rndSayi = " + rndSayi);

        int sayac=1;
        int tahmin;

        do {
            System.out.print("Tahmin giriniz = ");
            tahmin=input.nextInt();

            if (rndSayi==tahmin){
                System.out.println("TEBRİKLER");
                break;
            } else if (sayac!=3) {
                System.out.println("Bilemediniz Tekrar deneyiniz");

            }else {
                System.out.println("Maalesef bilemediniz tutulan sayı : " +rndSayi);
            }
            sayac++;

        }while (sayac<=3);*/

        //8- Girilen bir sayının kaç basamak olduğunu bulunuz.

       /* Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int sayac=0;
        while (sayi>0){

            sayi/=10;
            sayac++;
        }

        System.out.println("sayı = " + sayac+ " basamaklı");*/

        //9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.

       /* Scanner input = new Scanner(System.in);
        System.out.print("sayı gir: ");
        String sayi = input.nextLine();
        int basamak;
        int sayac=1;
        int uzunluk =sayi.length();
        int sayiInt=Integer.parseInt(sayi);
        char ters;

        while (sayac<=uzunluk){



         ters=   sayi.charAt(uzunluk-sayac);
         sayac++;
            System.out.print(ters);*/

       /* Scanner input = new Scanner(System.in);
        System.out.print("sayı gir: ");
        int sayiInt = input.nextInt();

        int tersi=0;

        while (sayiInt>0){

            tersi*=10;
            tersi+=sayiInt%10;
            sayiInt/=10;

        }
        System.out.println("tersi = " + tersi);*/

       // Soru-10 Girilen bir sayı ile tersi olan sayının aynı olup olmadığını bulan programı yazınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        int kontrol = sayi;
        int tersi=0;
        while (sayi>0){

            tersi*=10;
            tersi+=sayi%10;
            sayi/=10;
            

        }
        System.out.println("tersi = " + tersi);

        if ((kontrol-tersi)==0){
            System.out.println("Aynı");
        }else {
            System.out.println("farklı");
        }


    }
}
