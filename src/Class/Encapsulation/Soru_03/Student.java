package Class.Encapsulation.Soru_03;

public class Student {
  private int Id;
    private String name;
    private String lastName;
    private int age;
    private static  int sayac=1;
    public Student(){

    }
    public Student(String name, String lastName,int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;




    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getId() {
        return this.Id+=sayac++;
    }




    public String toString(){
        return "Öğrencinin\nid : " +
                this.getId()+ "\nAdı :"+
                this.name+"\nSoyadı :"+
                this.lastName+"\nYaşı :"+
                this.age+"\n";

}





}
