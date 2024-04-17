package JavaMap;

import java.util.HashMap;
import java.util.Map;

public class JavaMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1001,"Ismet Bektaş");
        hm.put(1002,"Recep Falay");
        hm.put(2001,"dursun çiçek");
        hm.put(5001,"ozan çavuş");
        hm.put(1002,"sercan serçe");
        hm.put(1002,"zeki serçe");

        System.out.println(hm);
        System.out.println(hm.get(1002));
        System.out.println(hm.containsKey(1005));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        hm.remove(1001);
        hm.put(1001,"Ismet bektaş");
        System.out.println(hm);
        System.out.println("*********");

        for (Integer key: hm.keySet())
            System.out.print(key+"\t");
        System.out.println();
        for (String value: hm.values() )
            System.out.print(value+"\t");
        System.out.println();
        System.out.println(hm);

        for (Map.Entry<Integer,String> kv: hm.entrySet()) {
            System.out.println(kv);
        }
        }
        
        


    }

