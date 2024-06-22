package Class.Encapsulation.Soru_03;

import java.util.Scanner;

public class SchoolMain {

    public static void main(String[] args){

        //School school= new School("Keles İHL",2);
        School school1=new School();
        school1.setSchoolName("Keles İHL");
        school1.setQuota(2);

        Scanner scanner= new Scanner(System.in);
        Scanner scanner1= new Scanner(System.in);

        do{
            Student student=new Student();
            System.out.print("isim :");
            String name=scanner.nextLine();
            student.setName(name);
            System.out.print("Soyisim :");
           String lastName=(scanner.nextLine());
           student.setLastName(lastName);
            System.out.print("yaşınız :");
            int age=(scanner1.nextInt());
            student.setAge(age);
            if (age<15){
                school1.students.add(student);
            }else {
                System.out.println("giriş yapılamaz yaşı 15 ten fazla");
            }

            System.out.println("****************");

        }while (school1.students.size()<school1.getQuota());

        for (Student str: school1.students) {
            System.out.println(str);

        }

        }
    }

