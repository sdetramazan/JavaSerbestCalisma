package Class.Ornek_08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    String studentName;
    int maxClock;
    ArrayList<Lesson> lessons = new ArrayList<>();

    public static void universityRule() {
        System.out.println("Üniversite Kuralları:");
        System.out.println("Kural 1: Çaysız ve üzümsüz derse gelme");
        System.out.println("Kural 2: Uykunu mutlaka al, sağlık en önemlisi");
        System.out.println("Kural 3: Her zaman dinç ve dinamik ol ve pozitif ol");
        System.out.println("Kural 4: En başta verdiğin sözü unutma, şu an kamptasın");
        System.out.println("Kural 5: İnşaallah, biz bu işi başaracağız.");
        System.out.println("Kural 6:tekrarsız derse gelme");
        System.out.println("Kural 7:Kendi hatasını bulan kraldır");
    }

    public void print() {
        System.out.println("**** Transkript ****");
        System.out.println("Sayın: "+this.studentName);
        System.out.println("Alacağınız dersler : ");
        int i=1;

        for (Lesson les:this.lessons ) {
            System.out.println(i+"- "+les.lessonName+". Ders Süresi: "+les.lessonClock+" saat");
            i++;
        }
    }
}
