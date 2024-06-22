package Enum.Soru_01;

public class Ornek {
    public static void main(String[] args) {

        Aylar ay =Aylar.SUBAT;
        switch (ay){
            case SUBAT : System.out.println(28);break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK: System.out.println(31);break;
            case NISAN:
            case HAZIRAN:
            case EYLUL:
            case KASIM:  System.out.println(30);break;
            default:case Tanimsiz:
        }
        if (ay == Aylar.SUBAT)
            System.out.println("Zam ayıdır");
        System.out.println(ay);
        System.out.println(ay.name());
        System.out.println(ay.ordinal());

        for (Aylar a:Aylar.values()) {
            System.out.println(a.ordinal()+". ay "+a.name());

        }

    }
}
