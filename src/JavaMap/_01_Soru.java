package JavaMap;

import java.util.HashMap;
import java.util.Map;

public class _01_Soru {
    public static void main(String[] args) {

// Bir kartvizit uygulamasını 2 kişi için yapınız
        HashMap<String,String> ugurKartVizit=new HashMap<>();
        ugurKartVizit.put("isim","Uğur Yılmaz");
        ugurKartVizit.put("email","ugur@gmail.com");
        ugurKartVizit.put("adres","çekmeköy/istanbul");
        ugurKartVizit.put("telefon","050566677788");

        System.out.println(ugurKartVizit.get("isim"));

        Map<String,String> zaferKartVizit=new HashMap<>();
        zaferKartVizit.put("isim","Zafer Canlı");
        zaferKartVizit.put("email","zafer@gmail.com");
        zaferKartVizit.put("adres","ümraniye/istanbul");
        zaferKartVizit.put("telefon","055566677788");
        System.out.println(zaferKartVizit.get("isim"));

        Map<String,Map<String,String>> kartVizitler = new HashMap<>();
        kartVizitler.put("uğur",ugurKartVizit);
        kartVizitler.put("zafer",zaferKartVizit);

        System.out.println(kartVizitler.get("uğur").get("isim"));

        for (Map.Entry<String,Map<String,String>> kv: kartVizitler.entrySet()) {
            System.out.println(kv);
            System.out.println(kv.getValue());
            System.out.println(kv.getValue().get("email"));
            
        }

    }
}
