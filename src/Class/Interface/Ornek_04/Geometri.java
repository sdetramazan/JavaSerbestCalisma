package Class.Interface.Ornek_04;

public class Geometri {
    public static void main(String[] args) {
        Kare kare = new Kare();
        System.out.println( kare.alan(10,9));
        System.out.println(kare.cevre(10,11));
        Dikdortgen dikdortgen= new Dikdortgen();
        System.out.println(dikdortgen.cevre(13,12));
        System.out.println(dikdortgen.alan(11,15));

    }
}
