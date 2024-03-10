package JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Soru {
    // Bir öğretmenden girmek istediği kadar notu alınız,
    // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
    // ve ortalamayı geçen öğrenci sayısını bulunuz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String selection="";
        int counter =0;
        double examGrade =0;
        double total= 0;
        double average=1;
        ArrayList<Double> examGrades=new ArrayList<Double>();
        ArrayList<Double> averageovernight=new ArrayList<Double>();
       do {
           System.out.print(counter+1+". öğrencenin notu: ");
           examGrade=input.nextDouble();
           examGrades.add(examGrade);
           counter++;
           total+=examGrade;
            input.nextLine();
           System.out.print("Devam etmek istiyor musunuz(E/H): ");
           selection=input.nextLine();

           } while (selection.equalsIgnoreCase("e" ));

        average=total/counter;
        for (double examGrade1:examGrades ) {
            if (examGrade1>average){
                averageovernight.add(examGrade1);
            }
        }
      System.out.println("Öğrenci notlarının ortalaması olan: "+average+" notunu geçen öğrenci sayısı "+averageovernight.size()+" kişi oldu");
        System.out.println(averageovernight+" alan öğrenci/ler ortalamyı Geçti.");
    }
}
