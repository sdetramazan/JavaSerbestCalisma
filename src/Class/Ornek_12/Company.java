package Class.Ornek_12;

public class Company {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.id=01;
        employee.name="Ramazan";
        employee.surName="ince";
        System.out.println(employee.id);
        System.out.println(employee.name);
        System.out.println(employee.surName);
        employee.enterPassword("ramazan");
        employee.enterPassword("raMazan1234");
        employee.showPassword();
    }
}
