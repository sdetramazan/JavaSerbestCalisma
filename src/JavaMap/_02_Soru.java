package JavaMap;

import java.util.*;

public class _02_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secenekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        System.out.println("Bu sözlükte yapabilecekliriniz:");
        System.out.println("1 - Ekleme\n2 - Düzeltme\n3 - Listeleme\n4 - Arama\n5 - Silme\n6 - Çıkış\n");


        Scanner input = new Scanner(System.in);

        Map<String, String> sozluk = new LinkedHashMap<>();
        String devam = "";

        do {

            System.out.print("Ne yapmak istiyorsunuz(1/6): ");
            int secim = input.nextInt();

            while (secim < 1 || secim > 6) {

                System.out.print("Lütfen(1/6) arası bir değer seçiniz : ");
                secim = input.nextInt();

            }

            input.nextLine();
            switch (secim) {


                case 1:
                    System.out.print("Kelime giriniz: ");
                    String kelime = input.nextLine();
                    System.out.print("Anlamını giriniz: ");
                    String anlami = input.nextLine();
                    sozluk.put(kelime, anlami);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Anlamını düzeltmek istediğiniz kelimeyi giriniz:");
                    kelime = input.nextLine();
                    System.out.print("yeni anlam giriniz:");
                    anlami = input.nextLine();

                    if (sozluk.containsKey(kelime)) {
                        sozluk.remove(kelime);
                        sozluk.put(kelime, anlami);
                        System.out.println();
                    }
                    break;
                case 3:
                    if (sozluk.isEmpty()) {
                        System.out.println("Listelenecek kelime bulunamadı.");
                    }
                    for (Map.Entry<String, String> kelimeler : sozluk.entrySet()) {
                        System.out.println(kelimeler.getKey() + " : " + kelimeler.getValue());
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Aranacak Kelimeyi giriniz: ");
                    kelime = input.nextLine();


                    if (sozluk.containsKey(kelime)) {
                        System.out.println(kelime + " kelimesinin anlamı : " + sozluk.get(kelime));
                    } else {
                        System.out.println("aradığınız kelime bulunamadı");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Silinecek kelimeyi giriniz: ");
                    kelime = input.nextLine();
                    if (sozluk.containsKey(kelime)) {
                        sozluk.remove(kelime);
                        System.out.println(kelime + " sözlükten silindi.");
                    } else System.out.println("Silinecek kelime bulunamadı.");
                    System.out.println();
                    break;
                case 6:
                    System.out.print("çıkmak istediğinizden emin misiniz(E/H): ");
                    String devam1 = input.next();
                    if (devam1.equalsIgnoreCase("e")){
                        System.out.println("Hoşçakalın...");
                        return;}

                    break;
            }

            System.out.print("Devam etmek istiyor musunuz(E/H): ");
            devam = input.next();


        } while (devam.equalsIgnoreCase("e"));


    }

}