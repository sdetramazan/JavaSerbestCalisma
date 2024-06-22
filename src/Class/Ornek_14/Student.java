package Class.Ornek_14;

public class Student {

    private int id;
    String fullName;

    private static int sayac=1;

    public Student(String fullName,int id){
        this.fullName=fullName;
        this.id=id;
    }
    public Student(String fullName){
        this.fullName=fullName;
        this.id=sayac++;
    }
    public String toString(){
         return "isim soyisim :"+this.fullName+
                "\nid :"+this.id;
    }
}
