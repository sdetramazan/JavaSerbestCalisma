package Class.Polymorphism.Ornek_01;

public class Student extends Base{
    private String branch;

    public Student(String firtsName, String lastName, String task,String branch) {
        super(firtsName, lastName, task);
        setBranch(branch);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
