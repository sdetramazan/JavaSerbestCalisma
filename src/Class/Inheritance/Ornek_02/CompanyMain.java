package Class.Inheritance.Ornek_02;

public class CompanyMain {
    public static void main(String[] args){
        Manager manager=new Manager("Ramazan",50000,01,2);
        Employee employee=new Employee("Betül",30000,12);
        System.out.println("employee = " + employee);
        System.out.println("manager = " + manager);
    }
}
