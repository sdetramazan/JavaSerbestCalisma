package Class.Polymorphism.Ornek_01;

public class SchoolMain {
    public static void main(String[] args) {
        Student student= new Student("Miraç","İNCE","Öğrenci","3/A");
        Employee employee=new Employee("Ramazan","ince","Planlama Managment","Planlama");

        Base.printCredentials(student);
        Base.printCredentials(employee);

    }
}
