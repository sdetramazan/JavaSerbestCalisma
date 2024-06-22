package Class.Encapsulation.Soru_01;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi= new Kisi();
        kisi.adAta("Ramazan");
        kisi.soyadAta("ince");
        kisi.yasAta(-1);
        System.out.println(kisi.getName());
        System.out.println(kisi.getLastName());
        System.out.println(kisi.getAge());
    }
}
