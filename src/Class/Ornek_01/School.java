package Class.Ornek_01;

public class School {
    public static void main (String[] args){
        Student student = new Student();
        student.name="Ramazan";
        student.surName="İNCE";
        student.schoolNumber=121;
        student.classroom=12;
        student.adress="Bursa";
        student.phone="02242522668";

        System.out.println("Adı Soyadı: "+student.name+" "+student.surName+"\nOkul Numarası: "+student.schoolNumber+"\nSınıfı: "+student.classroom+"\nAdresi: "+student.adress+"\nTelefonu: "+student.phone);
    }



}
