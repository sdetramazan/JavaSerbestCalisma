package Class.Encapsulation.Soru_01;

public class Kisi {

    private String name;//25 karakter sınırı
    private String lastName;//25 karakter sınırı
    private int age;


    public void adAta(String name){
        if (name.length()>25)
            System.out.println("25 karakterden fazla giriş yapılamaz");
        else this.name=name;
    }
    public void soyadAta(String lastName){
        if (lastName.length()>25)
            System.out.println("25 karakterden fazla giriş yapılamaz");
        else
            this.lastName=lastName;
    }
    public void yasAta( int age){
        if (age>0) {
            this.age=age;
        }else
            System.out.println("Hatalı giriş");

    }
public int getAge(){return this.age;}
    public String getName(){return this.name;}
    public String getLastName(){return lastName;}
}
