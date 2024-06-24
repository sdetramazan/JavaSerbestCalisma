package Class.Encapsulation.Soru_03;

import java.util.Scanner;

public class SchoolMain {
        public static void main(String[] args) {
                School school=new School("Keles İHL",2);

                Scanner scanner= new Scanner(System.in);
                Scanner scannerint= new Scanner(System.in);

                do {
                        System.out.print("öğrencinin Adı :");
                        String name=scanner.nextLine();
                        System.out.print("Öğrencinin Soyadı :");
                        String lastName=scanner.nextLine();
                        System.out.print("Öğrencinin Yaşı :");
                        int egg= scannerint.nextInt();
                        if (egg<15){
                                Student student= new Student(name,lastName,egg);
                                school.getStudents().add(student);
                        }else
                                System.out.println("öğrencinin yaşı 15 ve yüksek olamaz tekrar giriş yapınız");

                        System.out.println("***********************");
                }while (school.getStudents().size()<school.getQuota());

                System.out.println(school.getStudents());
        }


        }


