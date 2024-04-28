package Class.Ornek_06;

public class Sekil {
    public static void main(String[] args) {
        Rectangle r =new Rectangle();

        r.length=5;
        r.width=8;

        System.out.println("alan "+r.alan());
        System.out.println("Çevre"+r.cevre());

        System.out.println("Çevre1 :"+ r.cevre1(5,3));
    }
}
