package Soru;

public class _07_Soru {
    public static void main (String[] args){

        String bagis1="500";//kelime
        String bagis2="1500";//kelime

        //bana toplam bağış miktarı bul

        int bagis01=Integer.parseInt(bagis1);
        int bagis02=Integer.parseInt(bagis2);

        int toplamBagis=bagis01+bagis02;
        System.out.println("toplamBagis = " + toplamBagis);

        //int toplam1= bagis1+bagis2; bu şekilde toplama yapılamaz yapmak için
        // Integer.parseInt(bagis1) ile sayıya dönüştürmüş oluruz.

        //bunların int yani rakama dönüşmesi lazım
    }
}
