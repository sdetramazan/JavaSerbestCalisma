package Class.Interface.Ornek_02;

public class GeometriMain {
    public static void main(String[] args){
        Cember c = new Cember();
        Dikdortgen d = new Dikdortgen();
        c.cizdirir();
        d.cizdirir();
        System.out.println("*********");
        ICizdirir iCizdirir=new Cember();
        iCizdirir.cizdirir();
        ICizdirir iCizdirir1= new Dikdortgen();
        iCizdirir1.cizdirir();

        System.out.println("--------");

        print(c);
        print(d);



    }
    public static void print(ICizdirir p){p.cizdirir();}
}
