package Class.Inheritance.Ornek_02;

public class Employee {
    private String firstName;
    private double salary;
    private double salaryCoefficient;

    public Employee(String firstName,double salary,double salaryCoefficient){
        setFirstName(firstName);
        setSalary(salary);
        setSalaryCoefficient(salaryCoefficient);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public double salaryCalculat(){
        return getSalary()*getSalaryCoefficient();
    }
    @Override
    public String toString(){
        return "\nAdı :" +this.firstName+
                "\nMaaşı :"+this.salary+
                "\nMaaş Katsayısı :"+this.salaryCoefficient+
                "\nMaaş Hasepla : "+salaryCalculat();
    }
}
