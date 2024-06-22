package Class.Encapsulation.Soru_03;

import java.util.ArrayList;

public class School {
    private String schoolName;
    private int quota;
   ArrayList<Student> students=new ArrayList<>();

    public School(String schoolName,int quota){
        this.schoolName=schoolName;
        this.quota=quota;
    }
    public School(){

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
