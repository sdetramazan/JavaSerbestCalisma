package Tekrar.Gun01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Ornek01 {
    public static void main(String[] args) {
       /* // Soru : Pazartesi kelimesinin her bir harfini ayrı satırda yazdırınız.
        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");
        System.out.println("pazar\rtesi");
        //       Soru :   Ekrana      "Hello ", "World  \ /"        şeklinde yazınız
        System.out.println("\"Hello \", \"World \\ /\"");
        // Başla
        // bir karenini kenar uzunluğu 5 dir. Karenin çevresini ve alanını hesaplayıp yazdırınız.
        // cevre = kenar+kenar+kenar+kenar  yani cevre=4*kenar;
        // alan = kenar*kenar

        int kenar=5;
        int cevre=kenar*4;
        int alan=kenar*kenar;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);

        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);

        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);*/

        // Örnek soru : yaricapi 4.2 olan bir dairenin çevresini ve alanını bulunuz.
        // cevre = 2*yaricap*3.14;       alan= 3.14*yaricap*yaricap

        //double yaricap, cevre, alan;

        /*double yariCap=4.2;
        double cevre =2*yariCap*3.14;
        double alan =3.14*yariCap*yariCap;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);*/

        // kişinin kilosunu(kg) ve boyunu(m) kendiniz veriniz.
        // ekrana kilonuz : ....  ve boyunuz= .... yazdıktan sonra
        // vücut kitle indeksini bulunuz : kilo/ (boy*boy)

       /* double kilo =85.5;
        int boy= 182;
        double kitleIndex=kilo/(boy*boy);
        System.out.println("Kilonuz :"+kilo+"kg\tBoyunuz :"+boy+"cm");
        System.out.println("kitleIndexiniz = " + kitleIndex);*/

       /* String bagis1="500"; // kelime
        String bagis2="1500"; // kelime

        // bana toplam bağış miktarı lazım.
        //int toplam=bagis1+bagis2;  bu olmadı
        //bunların int e yani rakam a dönüştürülmesi lazım.

        int bagis01=Integer.parseInt(bagis1);
        int bagis02=Integer.parseInt(bagis2);
        int toplam=bagis02+bagis01;
        System.out.println("toplam = " + toplam);*/

      /*  // String olarak verilen 3 notun ("82","95","56") ortalamasını bulunuz.
        String yaziNot1="82";  // yazı hali mi rakam hali mi
        String yaziNot2="95";
        String yaziNot3="56";

        int not1=Integer.parseInt(yaziNot1);
        int not2=Integer.parseInt(yaziNot2);
        int not3=Integer.parseInt(yaziNot3);
        double ortalama=(not1+not2+(double)not3)/3;

        System.out.println("ortalama = " + ortalama);*/

       /* Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int number= input.nextInt();
        System.out.println("girilen sayı: "+number);*/
      /* // Girilen bir adı ekrana yazdırınız
        Scanner input = new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        String name=input.nextLine();
        System.out.println("name = " + name);*/

        // Kullanıcıdan Adını ve soyadını alarak ekrana yazdırınız
        // Adınız ve Soyadınız= İsmet Temur
       /* Scanner input = new Scanner(System.in);
        System.out.print("Adınız ve Soyadını= ");
        String fullName=input.nextLine();
        System.out.println("fullName = " + fullName);*/

       /* // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.
        Scanner input= new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        String firtName= input.nextLine();

        System.out.print("soyadınızı giriniz: ");
        String lastName= input.nextLine();

        System.out.println("name = " + firtName+"\tlast Name ="+lastName);*/


       /* // Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int number=input.nextInt();

        System.out.print("Sayı giriniz :");
        int number1=input.nextInt();

        int total = number1+number;
        System.out.println("Toplam = " + total);*/

        /*//Bir karenin kenarını(tam sayı) kullanıcıdan isteyip
        // çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+a+a+a    alan =a*a

        Scanner input = new Scanner(System.in);
        System.out.print("Karenin kenar uzunluğu: ");
        int number= input.nextInt();

        int cevre = number*4;
        int alan = number*number;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);*/

       /* //Bir dikdörtgenin gerekli kenar(int) uzunluklarını kullanıcıdan
        //isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*b

        Scanner input = new Scanner(System.in);
        System.out.print("Uzun kenar uzunluğu: ");
        int uzun = input.nextInt();

        System.out.print("Kısa kenar uzunluğu: ");
        int kisa = input.nextInt();

        int cevre= (kisa+uzun)*2;
        int alan = kisa*uzun;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);*/

       /* // Kullanıcıdan ağırlığını(kg) double, boyunu(m) double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kitle indexini de bularak yazdırınız   kg/ (boy*boy)

        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz: ");
        double kilo = input.nextDouble();

        System.out.print("Boyunuzu giriniz: ");
        double boy= input.nextDouble();

        System.out.println("Kilonuz: "+kilo+"kg\tBoyunuz: "+boy+"m");
        double index=kilo/(boy*boy);
        System.out.println("index = " + index);*/

       /* // Kullanıcıya öğrenci misiniz şeklinde sorunuz.
        // Evet ise True, değil ise False cevabını veriniz,
        // ve alınan cevabı yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Öğrenci misiniz: ");
        boolean answer=input.nextBoolean();

        System.out.println("answer = " + answer);*/

      /*  // Kullanıcıdan Cadde(s), Sokak(s) , PostaKodu(int) ve ülke(s)
        // evSahibi(b) şeklinde adres bilgisini alarak yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("cadde: ");
        String cadde = input.nextLine();

        System.out.print("Sokak: ");
        String sokak = input.nextLine();
        System.out.print("ülke: ");
        String ulke = input.nextLine();

        //input.nextInt();

        System.out.print("Posta Kodu: ");
        int postaKodu = input.nextInt();

        System.out.println("adres: "+sokak+" sokak\t"+cadde+" cadde\nülke :"+ulke+" \t posta kodu "+postaKodu);*/

       /* // StringLength  -> bir Stringin uzunluğunu verir.(Kaç tane harf var)

        String cumle="Bugün hava çok güzel";

        int uzunluk=cumle.length();
        System.out.println("uzunluk = " + uzunluk);
        // charAt istenilen noktadaki karakteri verir
        //                      111
        //            0123456789012

        char karakter=cumle.charAt(4);
        System.out.println("karakter = " + karakter);*/

       /* // Girilen bir stringin sadece son Harfini yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("cümle girin: ");
        String cumle= input.nextLine();

        int uzunluk=cumle.length();
        char sonHarf=cumle.charAt(cumle.length()-1);
        System.out.print("sonHarf = " + cumle.charAt(cumle.length()-1));*/

       /* // IndexOf : verilen karakter(lerin) indexini veriri
        // 01234  : harflerin oda numarası
        // Bugün

        String cumle="Merhaba Dünya";
        // h nin oda numarası kaç : 3
        // a nın oda numarası kaç : 4 tür
        // Dü nin indexi kaç : 8

        System.out.println(cumle.indexOf("Dü"));
        System.out.println(cumle.indexOf('a',5));*/

        /*// indexOf : baştan itibaren arayıp oda numarasını döndürür
        // lastIndexOf : sondan itibaren aramaya başlar
        //                      111
        //            0123456789012
        String cumle="Meyrhaba Dünya";
        System.out.println(cumle.length()-1);
        System.out.println(cumle.lastIndexOf("y"));
        System.out.println(cumle.indexOf('y'));
        System.out.println(cumle.lastIndexOf("a",8));*/

       /* // Girilen bir ad soyadı örneğin "Ismet Temur" ->  I.T.  şeklinde yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Adınız ve soyadınız: ");
        String fullName=input.nextLine();
        System.out.println(fullName.charAt(0)+", "+fullName.charAt(fullName.indexOf(" ")+1));
        System.out.println(fullName.charAt(0)+" "+fullName.charAt(fullName.lastIndexOf(" ")+1));*/

       /* // concat bir string diğerine birleştiriyor

        String s1="Merhaba";
        String s2="Dünya";

        String cumle =s1.concat(" "+s2);
        System.out.println("cumle = " + cumle);

        s1=s1.concat(" "+s2);

        System.out.println("s1 = " + s1);*/

       /* //contains : bir String in içerinide karakterin var olup
        //olmadğını boolen cinsinden söyle true veya flase

        String cumle="Merhaba dünya";
        boolean varMi=cumle.contains("a");
        System.out.println("varMi = " + varMi);

        System.out.println(cumle.contains("a"));
        System.out.println(cumle.contains("ya"));
        System.out.println(cumle.contains("Ya"));*/

      /*  //equals : 2 stringin birbirine eşit olup olmadğını kontrol eder.
        //sonuç boolen

        String s1="Merhaba";
        String s2="MerhabA";
        boolean esitMi=s1.equals(s2);
        System.out.println("esitMi = " + esitMi);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Merhaba"));*/

        /*//EqualsIgnoreCase: equals aynı çalışır sadece büyük küçük harf farketmez
        sonuç boolen

        String s1="Merhaba";
        String s2="Merhaba";

        System.out.println(s1.equalsIgnoreCase(s2));*/

       /* // isEmpty Stringin için boş mu dolu mu

        String s1 ="Merhaba";
        String s2 ="";

        boolean bosMu=s2.isEmpty();
        System.out.println("bosMu = " + bosMu);

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());*/

       /* // stringin belli bir bölümünü alma işlemini yapar

        String s1= "Merhaba arkadaşlar";

        String parca=s1.substring(5);
        System.out.println("parca = " + parca);
        System.out.println(s1.substring(5,9));*/

        /*// tek seferde girilen bir ad soyadın (tam ad) adını ve saydını ayırıp
        //ayrı ayrı yazdırınız (sadece ad soyad)

        Scanner input = new Scanner(System.in);
        System.out.print("Adınızı ve Soyadınızı giriniz: ");
        String fullName=input.nextLine();

        String name=fullName.substring(0,(fullName.indexOf(" ")-1));
        String lastName=fullName.substring(fullName.indexOf(" ")+1);
        System.out.println(name+"\n"+lastName);*/

       /* //StarsWith : bununla başlıyor mu?
        //sonuç true veya false

        String text="HCL Teknoloji"; // LeasePlan
        System.out.println(text.startsWith("Te"));
        System.out.println(text.endsWith("loji"));*/

       /* //EndsWith : verilen karakter(ler) ile bitiyor mu
        // sonuc true veya false yani boolean döner


        String text="Merhaba Dünya";

        System.out.println(text.endsWith("Dünya"));
        System.out.println(text.endsWith("ya"));*/

        /*// toLowerCase : stringi küçük harfe çevirir

        String text = "Merhaba Dünya";
        System.out.println("text = " + text);
        System.out.println(text.startsWith("m"));
        System.out.println(text.toLowerCase());
        System.out.println(text.toLowerCase().startsWith("m"));*/

       /* // toUpperCase : stringi büyük harfe çevirir

        String text = "Merhaba Dünya";

        System.out.println(text.toLowerCase());
        System.out.println(text.toLowerCase().startsWith("M"));
        System.out.println(text.toUpperCase());
        System.out.println(text.toUpperCase().startsWith("M"));*/

       /* //Soru-1 Değeri 'true' olan bir boolean oluşturunuz. Boolean'ı yazdırınız

        int ankaraNufus=24000;
        int istNufus=23000;

        boolean buyuk= istNufus>ankaraNufus;
        System.out.println("buyuk = " + buyuk);*/

       /* //Soru-7 Değeri z olan bir char oluşturun. Bu char'ı yazdırın.

        char harf ='V';
        char kucukZ=(char)(harf+36);
        System.out.println("kucukZ = " + kucukZ);*/

       /*// Soru 2: String olarak verilen 3 adet paranın toplamını bulunuz ("100", "200", 300)
        String str1 = "100";
        String str2 = "200";
        String str3 = "300";

        int number1=Integer.parseInt(str1);
        int number2=Integer.parseInt(str2);
        int number3=Integer.parseInt(str3);

        System.out.println("Toplam :"+(number1+number2+number3));*/

       /*// Soru 3: String olarak verilen 3 taksit bilgisinin
        // ortalamasını(ondalıklı olarak) bulunuz.("150","185","95")
        String taksit1="150";
        String taksit2="185";
        String taksit3="95";

        int toplam=Integer.parseInt(taksit1)+Integer.parseInt(taksit2)+Integer.parseInt(taksit3);
        System.out.println("ortalama= "+(toplam/3));*/

        /*//Soru-21 Değeri -100 olan bir short oluşturun.Short'u yazdırın.

        short kedi=20;
        short mama=120;
        short fark=(short) (kedi-mama);
        System.out.println(fark);*/

        /*//Soru-7 Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        //Varsa True , yoksa False olarak konsoldan cevap veriniz.Boolean'ı yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Banka hesabınız var mı?:");
        boolean cevap = input.nextBoolean();

        System.out.println(cevap);*/

      /* // Soru-10 Kullanıcıdan alacağının 2 sayının 4 işlemini ekrana yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("sayı1 :");
        int number1=input.nextInt();

        System.out.print("sayı2 :");
        int number2=input.nextInt();

        int total = number1+number2;
        int fark = number1-number2;
        int carp = number1*number2;
        double bol = ((double)number1/number2);

        System.out.println("total = " + total);
        System.out.println("fark = " + fark);
        System.out.println("carp = " + carp);
        System.out.println("bol = " + bol);*/

       /*// Soru-11 Kullanıcıdan alacağınız 3 öğrenci ders notunun ortalamasını ekrana yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Ders notu1= ");
        double ders1= input.nextDouble();

        System.out.print("Ders notu2= ");
        double ders2= input.nextDouble();

        System.out.print("Ders notu3= ");
        double ders3= input.nextDouble();

        double total=ders1+ders2+ders3;

        double ortalama= total/3;
        System.out.println("ortalama = " + ortalama);*/

       /*// Soru-1 "I love java" olan bir String oluşturun ve bu Stringin toplam karakter sayısını bulan
        //programı yazınız.

        String message="I love java";
        System.out.println(message.length());*/

        /*//Soru-2 "Sprint planning" olan bir String oluşturun ve bu Stringin toplam karakter sayısını
        //bulan programı yazınız.

        String message = "Sprint planning";
        System.out.println(message.length());*/

       /*// Soru-3 "apple" olan bir String oluşturun ve String'in içinde "app" ifadesi olup
        //olmadığını doğrulan programı yazınız.

        String fruit="apple";
        boolean varMi= fruit.contains("app");

        System.out.println("varMi = " + varMi);*/

       /*// Soru-4 "orange" kelimesinden oluşan bir String oluşturun.String'in "Apple" ifadesine eşit
        //olup olmadığını doğrulayan programı yazınız.

        String fruit= "orange";
        
        boolean esitMi=fruit.equals("Apple");
        System.out.println("esitMi = " + esitMi);*/

      /* // Soru-5 "apple" olan bir String oluşturun. Oluşturduğunuz String'in "apple" ifadesine eşit
        //olup olmadığını doğrulayan programı yazınız.
    // NOT: Stringin büyük harf veya küçük harf olması programın sonucunu etkilemesin

        String fruit ="apple";

        boolean esitMi=fruit.equalsIgnoreCase("APpLE");
        System.out.println("esitMi = " + esitMi);*/

        /*//Soru-6 "Florida" kelimesinden bir String oluşturun ve Florida kelimesinin içinde bulunan 'o'
        //harfinin indexini yazdıran programı yazınız.

        String kent= "Florida";

        int harf =kent.indexOf("o");
        System.out.println("harf = " + harf);*/

       /* //Soru-7 "Thank you" olan bir String oluşturun ve "Thank you" ifadesinde, sadece 'y'
        //harfinin bulunduğu konumu yazdıran programı yazınız.

        String message = "Thank you";
        int konum = message.indexOf("y");
        System.out.println("konum = " + konum);*/

        /*//Soru-8 "Mouse" değerinde bir String oluşturun ve "Mouse" ifadesinin 3. sırasındaki karakteri
        //yazdıran programı yazdırınız.

        String message = "Mouse";
        char harf =message.charAt(2);
        System.out.println("harf = " + harf);*/

      /* // Soru-9 "paper" olan bir String oluşturun ve bu String'i "büyük harfe" çevirip yazdıran
        //programı yazınız. Örnek: Girdi => "apple" - Çıktı => APPLE

        String message = "paper";
        System.out.println(message.toUpperCase());*/

       /* //Soru-10 "OraNge" olan bir String oluşturun ve bu String'i "küçük harfe" çevirip yazdıran
       // programı yazınız.
        //Örnek: Girdi => "APPLE" - Çıktı => apple

        String fruit = "OraNge";
        System.out.println(fruit.toLowerCase());*/

       /*// Soru-11 "New Jersey" olan bir String oluşturun ve bu String'i "büyük harfe" çevirip
        //yazdıran programı yazınız.

        String message = "New Jersey";
        System.out.println(message.toUpperCase());*/


       /*// Soru-14 Ayrı ayrı girilen "ad" ve "soyadı" aralarında bir boşluk koyarak birleştiren programı
        //yazınız.

        String name ="Ramazan";
        String lastName="ince";

        String fullName=name.concat(" "+lastName);
        System.out.println("fullName = " + fullName);*/

       /* //Soru-15 Oluşturulan bir değişkene değer ataması yapılıp yapılmadığını veya boş(blank) olup
        //olmadığını sorgulayan programı yazınız.

        String bos ="1";
        System.out.println(bos.isEmpty());*/

       /* //Soru-16 Girilen bir kelimenin ilk ve son harfini bulup yazdıran programı yazınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String very=input.nextLine();

        System.out.println(very.charAt(0)+" "+very.charAt(very.length()-1));*/

        /*//Soru-17 Tek seferde girilen 3 kelimelik bir String'de kelimelerin sadece baş harflerini alarak
        //aralarına .(nokta) işareti koyarak yazdıran programı yazınız.
        //Örnek: Girdi => "Mehmet Ali Yılmaz" - Çıktı => M.A.Y

        Scanner input = new Scanner(System.in);
        System.out.print("Kelime: ");
        String message = input.nextLine();

        char harf1= message.charAt(0);
        char harf2=message.charAt(message.indexOf(" ")+1);
        char harf3=message.charAt(message.lastIndexOf(" ")+1);
        System.out.println(harf1+"."+harf2+"."+harf3);*/

       /* //Soru-18 Tek seferde girilen 3 kelimelik bir stringin her kelimesini ayrı bir değişkene
        //tanımlayıp kelimeleri ayrı ayrı yazdıran programı yazınız.
        /*Örnek: Girdi => "Mehmet Ali Yılmaz"
        Çıktı => Mehmet
        Ali
        Yılmaz

        String kelime = "merm haü bal güz";

        int bosluk1=kelime.indexOf(" ");
        int bosluk2=kelime.indexOf(" ",bosluk1+1);
        int bosluk3=kelime.indexOf(" ",bosluk2+1);
        int bosluk4=kelime.indexOf(" ",bosluk3+1);

        System.out.println(bosluk1);
        System.out.println("bosluk2 = " + bosluk2);


        String kelime1=kelime.substring(0,bosluk1);
        String kelime2=kelime.substring(bosluk1+1,bosluk2);
        String kelime3 =kelime.substring(bosluk2+1,bosluk3);
        String kelime4=(kelime.substring(bosluk3+1));
        System.out.println(kelime1);
        System.out.println(kelime2);
        System.out.println(kelime3);
        System.out.println(kelime4);*/

       /* int toplam, sayi =0;

        toplam =5 + ++sayi;
        System.out.println("toplam = " + toplam);*/

        // kullanıcının gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdırınız

       /* Scanner input = new Scanner(System.in);
        System.out.print("Sayi1 =" );
        int number1=input.nextInt();

        System.out.print("Sayi2 =" );
        int number2=input.nextInt();

        boolean esitMi=number1==number2;

        System.out.println("esitMi = " + esitMi);*/

        // girilen bir sayının tek sayı olup olmadığını yazdırınız.
        // true veya false

        // 0 2 4 6 8 10 12 : çift sayılar
        // 1 3 5 7 9 11 13 : tek sayılar

       /* Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int number = input.nextInt();

        boolean tekCift= number%2==0;
        System.out.println("tekCift = " + tekCift);*/

        /*// Baklava dilimimiz : if
        // Girilen bir sayı 10 dan büyük ise ekrana 10 büyük yazdırınız.
        //        1-Başla     {
        //        2-sayi oku  sayi=oku.nextInt();
        //        3-sayi > 10 ise "10 dan büyük" yaz   if (sayi>10) sout..
        //        4-Dur }

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int number = input.nextInt();

        if (number>10){
            System.out.println("Sayı 10 dan büyük");
        }*/

        /*// Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int number = input.nextInt();

        if (number<0){
            System.out.println("number= " + number+" negatif");
        }

        if (number==0){
            System.out.println("number = " + number+" eşit");
        }
        if (number>0){
            System.out.println("number = " + number+" pozitif");
        }*/

        /*// Girilen bir öğrencinin notuna göre 50 den büyük-eşit
        // ise geçtiniz, küçük ise kaldınız yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Notunuz: ");
        double not = input.nextDouble();

        if (not>=50)
            System.out.println("geçtiniz");
        if (not<50)
            System.out.println("kaldınız");*/

       /* // Girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.print("cümle: ");
        String cumle=input.nextLine();

        boolean varMi=cumle.contains("a");

        if (varMi==true)
            System.out.println("evet");
        if (varMi==false)
            System.out.println("hayır");

        //2.yol
        if (cumle.contains("a") == true)
            System.out.println("evet");
        if (cumle.contains("a") == false)
            System.out.println("hayır");

        //3.yol
        if (cumle.contains("a"))
            System.out.println("evet");
        if (cumle.contains("a")==false)
            System.out.println("Hayır");
        //4.yol
        if (cumle.contains("a"))
            System.out.println("evet");
        if (!cumle.contains("a"))
            System.out.println("hayır");
        //5.yol
        if (cumle.indexOf("a")>=0)
            System.out.println("evet");
        if (cumle.indexOf("a")<0)
            System.out.println("hayır");*/

/*// Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığı yazdırınız
        // VAR ve YOK şeklinde

//        hava  -> var desin
//        HAVA  -> var desin

        Scanner scan = new Scanner(System.in);
        System.out.print("cümle girin :");
        String cumle=scan.nextLine();
        String kelime=cumle.toLowerCase();

        if (kelime.contains("a")){
            System.out.println("Küçük harf var");
        }else if (!kelime.contains("a"))
            System.out.println("küçük harf yok");*/

/*// Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.  (confirm new password)

        Scanner scan = new Scanner(System.in);
        System.out.print("password: ");
        String password1=scan.next();

        System.out.print("password: ");
        String password2=scan.next();

        if (password1.equals(password2)){
            System.out.println("aynı");
        }
        if (!password1.equals(password2))
            System.out.println("değil");*/

        /*// Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("not: ");
        double not = scan.nextInt();

        if (not>=50)
            System.out.println("geçtiniz");
        else
            System.out.println("kaldınız");*/

/*// Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("sayı : ");
        int number = scan.nextInt();

        if (number%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");*/

        /*// Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi şeklinde yazdırınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı: ");
        int number = scanner.nextInt();

        if (number>0&&number%2==1)
            System.out.println("uygun sayı girildi");
        else
            System.out.println("uygun sayı girilmedi");*/

/*// Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi(büyük veya küçük) geçiyorsa ekrana evet
        // yazdırın değilse  hayır yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("String gir: ");
        String input = scanner.nextLine();
        int uzunluk = input.length();

        if (uzunluk>10&&input.toLowerCase().contains("study"))
            System.out.println("evet");
        else
            System.out.println("Hayır");*/

       /* // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı (büyük/küçük)
        // 3) en fazla 12 karakter olmalı.
        // kurallara uygun veya değil yazınız.

        Scanner scanner=new Scanner(System.in);
        System.out.print("password");
        String pass=scanner.next();

        if (pass.length()>7&&pass.length()<13&&!pass.toLowerCase().contains("pass"))
            System.out.println("kurallara uygun");
        else
            System.out.println("Kurallara uygun değil");*/

       /* // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yanyana iki sayı gir:");
        String number=scanner.nextLine();

        String number1=number.substring(0,number.indexOf(" "));
        String number2=number.substring(number.indexOf(" ")+1);
        int number01=Integer.parseInt(number1);
        int number02=Integer.parseInt(number2);


        //boolean esitMi=number01==number02;

        if (number01==number02)
            System.out.println("eşit");
        else
            System.out.println("eşit değil");*/

        /*// Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("kaç saat :");
        double saat = scanner.nextInt();
        if (saat<3)
            System.out.println(10+"tl");
      if (saat>=3&&saat<5)
            System.out.println(15+"tl");
            if (saat>=5)
                System.out.println(20+"tl");*/

        /*// Kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.
        int sayi=20;
        String sonuc =(sayi%2==0? "çift":"tek");
        System.out.println("sonuc = " + sonuc);*/

       /* //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini
        // ekrana yazdırınız. Ternary operatör ile yapınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı: ");
        int number=scanner.nextInt();

        System.out.println(number>50 ? "1":"0");

        }*/
       /* // Otopark ücretleri : (Ternary operatör ile yapınız.)
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız.

        int saat=3;
        String ne= (saat<=3) ? "10" : (saat<=5 ) ? "15":  "20";
        System.out.println( (saat<=3) ? "10 tl" : (saat<=5) ? "15" : "20");*/

       /* // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı =");
        int number= scanner.nextInt();

        System.out.println((number<0) ? "negatif" : (number==0) ? "sıfır" :  "pozitif" );*/

        /*System.out.println(Math.max(2,4));
        System.out.println(Math.random()*10*2);
        System.out.println(Math.floor(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.round(3.5));*/


       /* //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı1 =");
        int number1=scanner.nextInt();

        System.out.print("Sayı2 =");
        int number2=scanner.nextInt();

        System.out.print("Sayı3 =");
        int number3=scanner.nextInt();

        System.out.println(Math.max(Math.max(number1,number2),number3));*/

       /*// System.out.println((int) (Math.random()*10+2));

        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.
        // 5 girersem 5 e kadar sayı üretsin, ben tahmin etmeye çalışayım


        Scanner scanner= new Scanner(System.in);
        System.out.print("Sayı :");
        int sinir= scanner.nextInt();
        
        int rnd= (int) (Math.random()*sinir);
        System.out.println("rnd = " + rnd);

        System.out.print("Tahmininiz :");
        int tahmin = scanner.nextInt();

        if (tahmin==rnd){
            System.out.println("Tebrikler");
        }else
            System.out.println("Denemeye devam");

        System.out.println((tahmin==rnd) ? "Tebrikler" : "denemeye devam");*/

       /* // Girilen min ve max aralığında random sayı üreten programı yazınız.

        Scanner scanner= new Scanner(System.in);
        System.out.print("max number gir:");
        int max=scanner.nextInt();

        System.out.print("min number gir:");
        int min=scanner.nextInt();

        int rnd =(int)(Math.random()*(max-min)+min);
        System.out.println("rnd = " + rnd);*/

       /* // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("number gir:");
        int number = scanner.nextInt();

        System.out.print("number1 gir:");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("işlem gir:");
        String islem = scanner.nextLine();

        if (islem.toLowerCase().contains("t"))
            System.out.print("Toplama="+(number+number1));
        else if (islem.toLowerCase().contains("ç"))
            System.out.print("Çıkarma="+(number-number1));
        else if (islem.toLowerCase().contains("p"))
            System.out.print("Çıkarma="+(number*number1));
        else if (islem.toLowerCase().contains("b"))
            System.out.print("Bölme="+(number/(double)number1));
        else
            System.out.println("Hatalı giriş");*/

/*// Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fizik notu:");
        int not = scanner.nextInt();

        System.out.println((not>=90) ? "A" :
                            (not>=80) ? "B" : (not>=70) ? "C" : (not>=60) ? "D" : (not>=40) ? "E" :(not<40) ? "F" :"HATALI");*/

       /* // Daha önce çözdüğünüz hesap makinesi sorusunu,
        // switch ile çözünüz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("number1:");
        int number = scanner.nextInt();

        System.out.print("number2:");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("islem:");
        String islem = scanner.nextLine();

        switch (islem.toUpperCase()){
            case "T" : System.out.print("Toplam ="+(number+number1));break;
            case "Ç" : System.out.print("Çıkarma ="+(number-number1));break;
            case "P" : System.out.print("Çarpma ="+(number*number1));break;
            case "B" : System.out.print("Bölme:"+(number/(double)number1));break;
            default:   System.out.println("Hatalı giriş yapıldı");*/

       /* // Girilen bir sayının birler basamağının değerini yazı ile yazdırınız.
        // 234  -> birler basamağı -> 4  -> dört
        //  45  -> beş
        //   6  -> altı

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir:");
        int number = scanner.nextInt();

        int birler= number%10;

        switch (birler){
            case 0 : System.out.print("birler değeri sıfır"); break;
            case 1 : System.out.print("birler değeri bir"); break;
            case 2 : System.out.print("birler değeri iki"); break;
            case 3 : System.out.print("birler değeri üç"); break;
            case 4 : System.out.print("birler değeri dört"); break;
            case 5 : System.out.print("birler değeri beş"); break;
            case 6 : System.out.print("birler değeri altı"); break;
            case 7 : System.out.print("birler değeri yedi"); break;
            case 8 : System.out.print("birler değeri sekiz"); break;
            case 9 : System.out.print("birler değeri dokuz"); break;
            default:
                System.out.println("Hatalı");*/

        /*// Girilen bir Ay numarasına göre ayın kaç gün sürdüğünü yazdırınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("ay numarası gir:");
        int number = scanner.nextInt();
        switch (number){
            case 1:
            case 3:
            case 4:
            case 7:
            case 8:
            case 10:
            case 12: System.out.print("31 gün");break;
            case 2:System.out.print("28 gün");break;
            case 6:
            case 9:
            case 11:
            case 5:System.out.print("30 gün");break;
            default:
                System.out.println("Hatalı giriş");*/

        /*int i=0;
        while (i<5){
            System.out.println(i+1+". Merhaba");
            i++;}*/

      /* // Soru-1 Girilen bir sayının birler basamağının tek olup olmadığını ekrana yazdıran programı      yazınız
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir:");
        int number = scanner.nextInt();

        System.out.println((number%2==0) ? "çift":"Tek");*/
       /* Soru-2 Kullanıcıdan vize ve final notlarını girmesini isteyiniz.
                Not ortalaması 50 ve yukarısında ise "geçtiniz" , altında ise "kaldınız" yazdıran programı
        yazınız.
                Not: Ortalama alma şekli --> ortalama =(0.4 * vizeNotu)+(0.6 * finalNotu)*/
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("vize gir:");
        int vize = scanner.nextInt();

        System.out.print("final gir:");
        int final01 = scanner.nextInt();

        double ortalama = (final01*0.6+(double)vize*0.4);

        System.out.println((ortalama>=50) ? "geçtiniz":"kaldınız");*/

        /*//Soru-3 Girilen bir cümle A harfi ile başlıyorsa , "EVET", başlamıyorsa "HAYIR" yazdıran  programı yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("cümle gir: ");
        String cumle= scanner.nextLine();

        if (cumle.toUpperCase().startsWith("A"))
            System.out.println("Evet");
        else
            System.out.println("Hayır");*/

       /* Soru-4 Kullanıcıdan şifre oluşturmasını isteyiniz,şifreyi iki kez girerek doğrulama yapınız.
                Şifre aynı ise "TAMAM", değil ise "HATALI" yazdıran programı yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Şifre :");
        String password=scanner.nextLine();

        System.out.print("Şifre Tekrar :");
        String rePassword=scanner.nextLine();

        if (password.equals(rePassword))
            System.out.println("Tamam");
        else
            System.out.println("Hatalı");*/

        /*//Soru-1 Yan yana aralarında bir boslukla girilen 2 sayının birbirine eşit olup olmadığını
        //bulan programı yazınız.                Örnek: String sayilar="45 67";

        Scanner scanner= new Scanner(System.in);
        System.out.print("sayı gir:");
        String number=scanner.nextLine();

        int bosluk=number.indexOf(" ");

        String sayi1= number.substring(0,bosluk);
        String sayi2= number.substring(bosluk+1,number.length());

        int number1=Integer.parseInt(sayi1);
        int number2=Integer.parseInt(sayi2);

        System.out.println((number1==number2) ? "eşit" :"değil");*/

        /*//Soru-2 Yan yana aralarında bir boslukla girilen 3 sayının toplamlarının sonucunun tek mi
        //çift mi olduğunu bulan programı yazınız.     Örnek: String sayilar="45 67 123";

        Scanner scanner= new Scanner(System.in);
        System.out.print("sayı gir:");
        String number=scanner.nextLine();

        String boslukal=number.trim();

        int bosluk=boslukal.indexOf(" ");
        int bosluk2=boslukal.lastIndexOf(" ");


        String sayi1=boslukal.substring(0,bosluk);
               String sayi2=boslukal.substring(bosluk+1,bosluk2);
        String sayi3=boslukal.substring(bosluk2+1);

        int number1=Integer.parseInt(sayi1);
        int number2=Integer.parseInt(sayi2);
        int number3=Integer.parseInt(sayi3);

        int total=number1+number2+number3;

        if (total%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");*/
        /*// Ekrana 5 kez merhaba yazdırınız.

        String print="Merhaba";
        int i=1;
        while (i<=5){
            System.out.println(i+". Merhaba");
            i++;
        }*/


        /*//Girilen  5 tam sayının toplamının sonucunu yazdırınız

        Scanner scanner = new Scanner(System.in);
        int i=1;
        int total=0;
        while (i<=5){
            System.out.print(i+". sayıyı gir:");
            int number= scanner.nextInt();
            total+=number;
            i++;
        }
        System.out.println("Toplam: "+total);*/

        /*// Girilen 6 sayıdan sadece pozitif olanlarının
        // toplamını bulunuz

        Scanner scanner = new Scanner(System.in);

        int sayac=1;
        int pozitifTotal=0;
        while (sayac<=6){
            System.out.print(sayac+". sayıyı gir:");
            int number=scanner.nextInt();

            if (number>0)
                pozitifTotal+=number;
            sayac++;
        }
        System.out.println("pozitifTotal = " + pozitifTotal);*/

        /*// 1 den 100 e kadar olan sayıların toplamını bulunuz

        int i=1;
        int total=0;
        while (i<=100){
            total+=i;
            i++;
        }
        System.out.println("total = " + total);*/

       /* // Kullanıcının gireceği 6 sayıdan tek olanlarının toplamını bulunuz
        Scanner scanner = new Scanner(System.in);
        int i=1;
        int tekTotal=0;
        while (i<=6){
            System.out.print(i+". sayıyı gir:");
            int number = scanner.nextInt();

            if (number%2==1)
                tekTotal+=number;
            i++;
        }
        System.out.println("tekTotal = " + tekTotal);*/

        /*// kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz

        Scanner scanner =new Scanner(System.in);
        int number=1;
        int total=0;
        do {
            System.out.print("Sayı giriniz:");
            number= scanner.nextInt();
            total+=number;

        }while (number!=0);
        System.out.println("total = " + total);

        int number1=1;
        int total1=1;
        while (number1!=0){
            System.out.print("Sayı giriniz:");
            number1=scanner.nextInt();
            total1+=number1;
        }
        System.out.println("total1 = " + total1);*/

        /*// Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner scanner= new Scanner(System.in);
        System.out.print("Harf gir:");
        String harf=scanner.next();

        while (!harf.equalsIgnoreCase("x")){
            System.out.println("Program çalışıyor.");
            System.out.print("Harf gir:");
            harf=scanner.next();

        }
        System.out.println("while bitti");

        String harf1 =" ";
        do {
            System.out.print("harf gir:");
            harf1=scanner.next();
            if (!harf1.equalsIgnoreCase("x"))
            System.out.println("Program çalışıyor");
        }while (!harf1.equalsIgnoreCase("x"));
        System.out.println("do While Bitti");*/

        /*// 1 den 5 e kadar olan sayıları ekrana yazdırınız.

        int sayac =1;
        while (sayac<6){
            System.out.println(sayac);
            sayac++;
        }
        System.out.println("*************");

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1);

        }*/
       /* // 0 den 10(dahil) kadar sayıları ekrana yazdırınız.
        // 10 dan 0(dahil) kadar sayıları ekrana yazdırınız.(ayri bir diğer for)

        for (int i = 0; i <=10 ; i++) {
            System.out.print(i+"\t");
        }
        System.out.println();
        for (int i = 10; i>=0; i--) {
            System.out.print(i+"\t");
        }*/

        /*// kullanıcının gireceği bir rakama(dahil) kadar
        // olan sayıların toplamını bulunuz.
        
        Scanner scanner= new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int number = scanner.nextInt();
        int total=0;
                for (int i = 0; i <=number ; i++) {
            total+=i;            
        }
        System.out.println("total = " + total);*/

        /*// 0 dan 100 e kadar olan çift sayıların toplamını bulunuz.
        // toplam 50 yi geçtiğinde , mesaj yazınız.(50 geçildi şeklinde)

        // başlagıcı :0,  sonu belli 100, artışı 2 şer : for döngüsü

        int total=0;
        boolean sinirAsildi=false;

        for (int i = 0; i <=100 ; i=i+2) {
            total+=i;
            if (total>50&&sinirAsildi==false){
                System.out.println("50 geçildi " );
                sinirAsildi=true;
            }

        }
        System.out.println("total = " + total);*/

        /*// 0 dan 100 e kadar olan çift sayıların toplamını bulunuz.
        // toplam 50 yi geçtiğinde , mesaj yazınız.(50 geçildi şeklinde)
        // ve döngüden çıksın
        int total=0;

        for (int i = 0; i <=100 ; i=i+2) {
            total+=i;
            if (total>50){
                System.out.println("50 geçildi");
                break;// döngüyü kır, sonlandır, döngüden sonraki adıma geç
            }

        }
        System.out.println("total = " + total);*/

      /*  // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // bolum 2: carpimin degeri 10000 ü geçtiğinde işlem sonlansın.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int number= scanner.nextInt();
        int carpim=1;
        for (int i = 1; i <=number ; i++) {
            carpim*=i;
            if (carpim>10000){
                System.out.println("10000 aşıldı");
                break;}


        }
        System.out.println("carpim = " + carpim);*/
   /* // 2 ler çarpım tablosunu , aşağıdaki şekilde olarak yazdırınız.
        //    2 x 1 = 2
        //    2 x 2 = 4
        //    2 x 3 = 6
        //    2 x 4 = 8
        //    2 x 5 = 10
        //    2 x 6 = 12
        //    2 x 7 = 14
        //    2 x 8 = 16
        //    2 x 9 = 18
        //    2 x 10 = 20
            int carpan=2;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(carpan+"x"+i+"="+carpan*i);

        }*/
        /*// Kullanıcıdan sayı isteyiniz.
        // Bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın.
        Scanner scanner=new Scanner(System.in);
            int total=0;
        for (int i = 0; i <5; i++) {

        System.out.print("Sayı gir:");
        int number=scanner.nextInt();

        if (number>6&&number<10)
            continue;
        else
            total+=number;
    }

        System.out.println("total = " + total);*/

        /*// Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner scanner = new Scanner(System.in);
        System.out.print("String gir:");
        String kelime=scanner.nextLine();
        char bosluk=' ';
        int boslukSayisi=0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i)==bosluk){
                boslukSayisi++;
                continue;}

            System.out.println(kelime.charAt(i));


        }
        System.out.println("boslukSayisi = " + boslukSayisi);*/
       /* // 2 lerin çarpım tablosunu sormuştuk.
        // 2 x 1 =2
        // 2 x 2 =4
        // ....

        // 5(dahil) lere kadar halini yapınız

        for (int i = 2; i <=5 ; i++) {
            System.out.println();
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+"x"+j+"="+i*j);

            }

        }*/

       /* // Aşağıdaki görünümü tek yıldız kullanarak yazdırınız.
        //  ***** 1
        //  ***** 2
        //  ***** 3
        //  ***** 4
        //  ***** 5
        for (int i = 1; i <=5 ; i++) {
            for (int j = 0; j <=5 ; j++) {
                System.out.print("*");
            }
            System.out.println(" "+i);


        }*/
        /*// Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *        1.Satırda 1 yıldız
        // **       2.satırda 2 yıldız
        // ***      3.satırda 3 yıldız
        // ****     4.satırda 4 yıldız
        // *****    5.satırda 5 yıldız
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }*/
        /*   *
         ***
         *****
         *******
         *********
         */

        /*  *
         ***
         *****
         *******
         *********
         *******
         *****
         ***
         *   */
        /*int satirSayisi = 5;


      for (int i = 0; i <satirSayisi ; i++) {

            for (int j = 1; j <satirSayisi-i ; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k <(i*2)+1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < satirSayisi-1; i++) {

            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <(satirSayisi+2)-(i*2); k++) {
                System.out.print("*");
            }


            System.out.println();

        }*/
       /* // 5 elemanlı bir dizi tanımlandı

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i+1+". sayı giriniz:");
            numbers[i]=scanner.nextInt();
        }
        System.out.println("*****************");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+1+". sayı="+numbers[i]);

        }
        System.out.println("*****************");
        for (int i = numbers.length-1;i >= 0 ; i--) {
            System.out.println(i+1+". sayı="+numbers[i]);

        }*/

        /*// 5 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.

        Scanner scanner = new Scanner(System.in);
        int[] notlar= new int[5];
        int total=0;
        for (int i = 0; i < notlar.length; i++) {
            System.out.print(i+1+". notu giriniz:");
            notlar[i]=scanner.nextInt();
            total+=notlar[i];
        }
        int ortalama=total/ notlar.length;
        System.out.println("ortalama = " + ortalama);
        int ortalamayiGecen=0;

        for (int i = 0; i < notlar.length; i++) {

            if (notlar[i]>ortalama) {
                ortalamayiGecen++;
                System.out.println(i+1+". not ortalamayı geçti: "+notlar[i]);
            }

        }
        System.out.println("ortalamayı geçen notlar: "+ortalamayiGecen);*/

        /*// Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.
        Scanner scanner = new Scanner(System.in);
        int[] numbers=new int[7];
        int total=0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i+1+". sayıyı giriniz: ");
            numbers[i]=scanner.nextInt();
            total+=numbers[i];

        }
        double ortalama=total/ numbers.length;
        System.out.println("ortalama = " + ortalama);
        int gecenler=0;

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]>ortalama&&numbers[i]%2==1){
                gecenler++;
            System.out.println(i+1+". sayı:"+numbers[i]);}

        }
        System.out.println("gecenler = " + gecenler);*/

       /* // 5 tv kanalı ismini bir diziye doldurunuz. trt, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] tv = {"trt", "kanald", "atv", "habertürk", "tv7"};
        int[] number={1,2,3,4};
        String[] secilen = new String[tv.length];

            int sayi=0;
            for (int j = 0; j < secilen.length; j++) {
                int rnd = (int) (Math.random() * tv.length);
                Arrays.sort(tv);
              sayi=Arrays.binarySearch(tv,"trt");


            }
        System.out.println(sayi);




        }*/

        // TODO : gunun sorusu : bir döngü ile 5 tane rastgele buldurunuz
// TODO : fakat bir buldunu tekrar bulmasın


/*// 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz*/

       /* int[][] tablo=new int[2][3];
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun <tablo[satir].length; sutun++) {
                tablo[satir][sutun]=(int) (Math.random()*100);
            }
        }


        for (int satir = 0; satir < tablo.length ; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                System.out.print( tablo[satir][sutun] + "");

                System.out.println();



        }
            int tekSayi=0;
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                if (tablo[satir][sutun]%2==1)
                    tekSayi++;                   
                
            }
            

        }
        System.out.println("tekSayi = " + tekSayi);*/

        /*int[][] tablo=new int[][]{{2,3,5},{8,9,10}};

        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                System.out.print(tablo[satir][sutun]+ " ");
            System.out.println();

        }*/
       /* int[][] tablo=new int[][]{{2,3,5},{8,9,10}};
        System.out.println(Arrays.toString(tablo[0]));
        System.out.println(Arrays.toString(tablo[1]));
        System.out.println(tablo.length);
        System.out.println(tablo[0].length);
        System.out.println(tablo[1].length);*/

      /*  // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        int[][] tablo= new int[2][3];
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++){
                tablo[satir][sutun]=(int) (Math.random()*100);}
        }
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                System.out.print(tablo[satir][sutun]+ " ");
            System.out.println();

           // System.out.println(Arrays.toString(tablo[satir]));
        }
        int tekSayi=0;
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
               if (tablo[satir][sutun]%2==1)
                   tekSayi++;

            }


        }
        System.out.println("tek sayı = " + tekSayi);*/

/*// 2x3 lük bir tabloyu random 10 a kadar sayılarla doldurunuz.
        // Daha sonra kullanıcıdan bir sayı alınız.Bu sayı tabloda
        // var ise yerini (satir,sütun) yazdırınız.
        Scanner scanner = new Scanner(System.in);
        int[][] tablo = new int[2][3];

        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                tablo[satir][sutun]=(int) (Math.random()*10);

            }

        }
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                System.out.print(tablo[satir][sutun]+ " ");
                System.out.println();



        }
        System.out.print("Sayı giriniz: ");
        int number= scanner.nextInt();

        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                if (tablo[satir][sutun]==number)
                    System.out.print(satir+" "+sutun);

            }

        }*/

/*// 2x3 lük bir tabloyu random 10 a kadar sayılarla doldurunuz.
        // Daha sonra kullanıcıdan bir sayı alınız.Bu sayı tabloda
        // var ise yerini (satir,sütun) yazdırınız.
        Scanner scanner=new Scanner(System.in);
        int[][] tablo= new int[2][3];
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                tablo[i][j]=(int) (Math.random()*10);
            }
        }
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++)
                System.out.print(tablo[i][j]+" ");
            System.out.println();

        }
        System.out.print("sayı gir:");
        int number= scanner.nextInt();

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j]==number) {
                    System.out.println("j+\" \"+i = " + i + " " + j);

                }

            }

        }*/

      /*  // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.
        Scanner scanner = new Scanner(System.in);
        int[][] tablo= new int[3][2];
        
        int tek=0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print("Sayı gir:");
                tablo[i][j]=scanner.nextInt();
                
                if (tablo[i][j]%2==1)
                    tek++;

            }

        }
       
        
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j <tablo[i].length ; j++)
                System.out.print(tablo[i][j]+" ");
                System.out.println();
        }

        int[] tekler= new int[tek];
        int teklerIndex=0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j]%2==1){
                tekler[teklerIndex]=tablo[i][j];
                teklerIndex++;}

            }
            
        }
        System.out.println("tekler = " + Arrays.toString(tekler));

        for (int i = 0; i < tekler.length; i++) {
            System.out.print(tekler[i]+" ");

        }*/
      /*  int[][] tablo2={ // 5 satır x 4 sütun
                {4,55},     // 0.satır  2 sütun
                {3,56,77},  // 1.satir 3 sütun
                {23,2,3,1,4,55,66,7}, // 2.satır 8 sütun
                {13,44,55},  // 3.satır , 3 sütun
                {43}  // 4.satir , 1sütun
        };
        for (int i = 0; i < tablo2.length; i++) {
            for (int j = 0; j < tablo2[i].length; j++)
                System.out.print(tablo2[i][j]+" ");
            System.out.println();



        }*/
       /* // bir sayının tekmi çift mi olduğunu yazdırınız.

        int number=33;

        if (number%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");*/

        // int[] dizi = new int[20];
        // numbers(dizi);
       /* int[] dizii=new int[5];
        doldur(dizii);
        kucuk(dizii);
        buyuk(dizii);
        ortalama(dizii);

    }*/
/*// mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
    // göndererek random 100 e kadar olan sayılarla dodurunuz. ve aynı fonksiyonda
    // yazdırınız.
        public static void numbers(int[] dizi){
            for (int i = 0; i < dizi.length; i++) {
                dizi[i]=(int) (Math.random()*100);

            }
            System.out.println(Arrays.toString(dizi));
            for (int i = 0; i < dizi.length; i++) {
                System.out.print(dizi[i]+" ");
}
            }*/
  /*  // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
    // dizinin en küçük, en büyük elemanını ve
    // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

    public static void doldur(int[] dizii){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dizii.length; i++) {
             System.out.print("Sayı gir:");
             dizii[i]=scanner.nextInt();
    }
    }
    public static void kucuk(int[] dizii){
        int kucuk=1;
        for (int i = 0; i < dizii.length; i++) {
           if (kucuk>dizii[i]){
               kucuk=dizii[i];
           }


        }
        System.out.println("Küçük sayı="+kucuk);
    }
    public static void buyuk(int[] dizii){
        int buyuk=0;
        for (int i = 0; i < dizii.length; i++) {
            if (buyuk<dizii[i]){
                buyuk=dizii[i];
            }


        }
        System.out.println("büyük sayı="+buyuk);
    }
    public static void ortalama(int[] dizii){
        int ortalama=1;
        int total=0;
        int say=0;
        for (int i = 0; i < dizii.length; i++) {
            for (int j = 0; j < dizii.length; j++) {
                total+=dizii[i];
                say++;
            }
            ortalama=total/say;

            }
            System.out.println("ortalama="+ortalama);

        }*/

    }

    
        }

























