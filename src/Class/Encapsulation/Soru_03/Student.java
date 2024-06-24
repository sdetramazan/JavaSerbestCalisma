package Class.Encapsulation.Soru_03;

public class Student {
    private final int id;
    private static int sayac=1;
    private String firstName;
    private String lastName;
    private int egg;

    public Student(String firstName, String lastName, int egg){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEgg(egg);
        this.id=sayac++;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }

    public String toString(){
        return "\nÖğrencinin:" +
               "\nId no:"+id +
               "\n Adı :"+firstName+
               "\nSoyadı :"+lastName+
               "\nYaşı :"+egg+"\n**************";

    }
}
