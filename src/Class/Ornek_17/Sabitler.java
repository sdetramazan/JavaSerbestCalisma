package Class.Ornek_17;

public class Sabitler {

    final static int gun=86400;
    final static int saat=3600;
     final static int dakika=60;
    private int saniye;



    public int toplam(int gun, int saat, int dakika){

       this.saniye= this.gun*gun+this.saat*saat+this.dakika*dakika;
       return saniye;
    }

    public String toString(){
        return "gün :"+this.gun+
                "\nsaat :"+this.saat+
                "\ndakika :"+this.dakika+
                "\nToplam Saniye Karşılığı :"+this.saniye;

    }

}
