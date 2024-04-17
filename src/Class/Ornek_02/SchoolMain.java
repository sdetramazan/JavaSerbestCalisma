package Class.Ornek_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner intInput=new Scanner(System.in);
        ArrayList<Student> studentList=new ArrayList<>();

        for (int i = 1; i <=3; i++) {
            Student student = new Student();
            System.out.println(i+". Öğrencinin:");

            System.out.print("Adı:");
            student.name = input.nextLine();
            System.out.print("Soyadı:");
            student.surName = input.nextLine();
            System.out.print("Adresi:");
            student.adress = input.nextLine();
            System.out.print("Sınıfı:");
            student.classRoom = intInput.nextInt();
            System.out.println("*****************");
            studentList.add(student);

        }
        int i=1;
        for (Student studentt:studentList ) {
            System.out.println(i+". Öğrencinin:");
            System.out.println("Adı: "+studentt.name);
            System.out.println("Soyadı: "+studentt.surName);
            System.out.println("Sınıfı: "+studentt.classRoom);
            System.out.println("Adresi: "+studentt.adress);
            System.out.println("-----------------");
            i++;
            
        }
    }
}
