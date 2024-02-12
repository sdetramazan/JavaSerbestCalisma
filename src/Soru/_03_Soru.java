package Soru;

public class _03_Soru {
    public static void main(String[] args){

        // Örnek soru : yarıçapı 4.2 olan bir dairenin çevresini ve alanını bulun?
        // çevre = 2 *yarıçap*3,14; alan =3,14*yarıçap*yarıçap
        //double yaricap, cevre, alan; da olur

        double yariCap=4.2;
        double cevre =2*yariCap*3.14;
        double alan =3.14*yariCap*yariCap;

        System.out.println("Çevre =" +cevre+"cm"+"\tAlan= "+alan+"cm2");
    }
}
