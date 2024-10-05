package Classes.Gun01;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolMain {
    public static void main(String[] args) {
        Scanner inInt=new Scanner(System.in);
        Scanner inStr=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
            int count=0;
        for (int i = 0; i < 3; i++) {
            ++count;
            System.out.println(count+". Öğrencinin");
            Student student=new Student();
            System.out.print("adı: ");
            student.firsName=inStr.nextLine();
            System.out.print("soyadı:");
            student.lastName=inStr.nextLine();
            System.out.print("sınıfı:");
            student.classRoom=inStr.nextLine();
            System.out.print("Adresi:");
            student.adress=inStr.nextLine();
            students.add(student);


        }

        for (Student o:students ) {
            System.out.println("o = " + o.firsName);
            System.out.println("o.lastName = " + o.lastName);
            System.out.println("o.classRoom = " + o.classRoom);
            System.out.println("o.adress = " + o.adress);
            System.out.println("******");
        }




    }
}
