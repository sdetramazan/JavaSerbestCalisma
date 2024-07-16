package Class.Interface.Ornek_03;

public class A4 implements IGoster,IYazdir{
    @Override
    public void goster() {
        System.out.println("göster");
    }

    @Override
    public void print() {
        System.out.println("yazdır");
    }
}
