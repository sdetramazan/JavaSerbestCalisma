package Class.Inheritance.Ornek_04;

public class SchoolMain {
    public static void main(String[] args) {
        LiseStudent liseStudent= new LiseStudent("Ramazan","bilgisayar");
        System.out.println("liseStudent = " + liseStudent);
        ilkStudent ilkStudentt=new ilkStudent("Eba","kütüphane");
        System.out.println("ilkStudentt = " + ilkStudentt);
    }
}
