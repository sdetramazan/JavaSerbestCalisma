package Class.Ornek_15;

public class Student {
    final int id;

    String fullName;

    private static int sayac=1;

public Student(String fullName){
    this.fullName=fullName;
    this.id=sayac++;
}
public String toString(){
    return this.fullName+"\n"+
            this.id;
}
}
