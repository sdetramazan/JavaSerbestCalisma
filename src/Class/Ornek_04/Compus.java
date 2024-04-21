package Class.Ornek_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Compus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);
        ArrayList<Student> studentList=new ArrayList<>();

            Student student=new Student();
            System.out.println("Öğrencinin: ");
            System.out.print("Okul No: ");
            student.schoolNumber=input.nextInt();
            System.out.print("Adı: ");
            student.name=strInput.nextLine();
            System.out.print("Soyadı: ");
            student.surName=strInput.nextLine();
            System.out.print("Okulu:");

           student.school=new School();
            student.school.schoolName=strInput.nextLine();
            System.out.print("Müdür Adı:");
            student.school.managerName=strInput.nextLine();
            System.out.print("Okul Adresi:");
            student.school.schoolAdress=strInput.nextLine();
            studentList.add(student);
            studentPrint(studentList);

    }
    public static void studentPrint(ArrayList<Student> studentList){

        for (Student student:studentList) {
            System.out.println(student.schoolNumber);
            System.out.println(student.name);
            System.out.println(student.surName);
            System.out.println(student.school.schoolName);
            System.out.println(student.school.managerName);
            System.out.println(student.school.schoolAdress);
        }

    }
}
