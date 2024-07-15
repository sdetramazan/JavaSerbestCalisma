package Class.Polymorphism.Ornek_01;

import Class.Polymorphism.Ornek_01.Base;

public class Employee extends Base {
    private String department;

    public Employee(String firtsName, String lastName, String task, String department) {
        super(firtsName, lastName, task);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
