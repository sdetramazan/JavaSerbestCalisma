package Soru;

public class _04_Soru {
    public static void main(String[] args){

        // kişinin kilosunu ve boyunu kendiz veriniz.
        //ekrana kilonuz : ..... ve boyunuz .... yazdıktan sonra
        //vucut kitle indeksini bulunuz. kilo/(boy*boy)

        double kilo= 94;
        double boy= 185;
        double kitleIndex=kilo/(boy*boy);

        System.out.println("kilonuz : " + kilo+"\nboyunuz :"+boy +"\nKitle indexiniz :"+kitleIndex);
    }
}
