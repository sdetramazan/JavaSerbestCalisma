package Class.Ornek_05;

public class Company {
    public static void main(String[] args) {
        Person person=new Person();
        Person person1=new Person();


        person1.name="Ramazan";
        person1.surName="ince";
        person1.age=43;

        person.name="miraç";
        person.surName="ince";
        person.age=8;

        System.out.println( person.toString());
        System.out.println(person.getBirthYear());
        System.out.println("***********");
        System.out.println(person1.toString());
        System.out.println(person1.getBirthYear());
    }
}
