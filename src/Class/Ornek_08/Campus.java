package Class.Ornek_08;

public class Campus {
    public static void main(String[] args) {
        Student.universityRule();
        Lesson lesson=new Lesson();
        Lesson lesson1=new Lesson();
        Lesson lesson2=new Lesson();
        lesson.lessonName="Java";
        lesson.lessonClock=5;
        lesson1.lessonName="C++";
        lesson1.lessonClock=3;
        lesson2.lessonName="Pascal";
        lesson2.lessonClock=2;

        Student student=new Student();
        student.studentName="Ramazan";
        student.maxClock=80;
        student.lessons.add(lesson);
        student.lessons.add(lesson1);
        student.lessons.add(lesson2);

        student.print();



    }
}
