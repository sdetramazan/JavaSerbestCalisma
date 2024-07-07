package Class.Inheritance.Ornek_02;

public class Manager extends Employee {
    private double compensation;
    public Manager(String firstName, double salary, double salaryCoefficient,double compensation) {
        super(firstName, salary, salaryCoefficient);
        setCompensation(compensation);

    }

    public double getCompensation() {
        return compensation;
    }

    public void setCompensation(double compensation) {
        this.compensation = compensation;
    }
@Override
    public double salaryCalculat(){return super.salaryCalculat()+this.compensation;}
@Override
   public String toString(){
        return super.toString() +"\nTazminatı :"+ this.compensation;
   }
}
