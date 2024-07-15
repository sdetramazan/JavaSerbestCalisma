package Class.Polymorphism.Ornek_01;

public class Base {
    private String firtsName;
    private String lastName;
    private String task;




    public Base(String firtsName,String lastName, String task){
        setFirtsName(firtsName);
        setLastName(lastName);
        setTask(task);
    }

    public static void printCredentials(Base comingPerson){
        System.out.println("***** Kimlik Bilgileri *******"+
                "\n Adı    :"+comingPerson.getFirtsName()+
                "\n Soyadı :"+comingPerson.getLastName()+
                "\n Görevi :"+comingPerson.getTask());
        if (comingPerson instanceof Employee){
            System.out.println(" Departmanı :"+((Employee) comingPerson).getDepartment());
        }else {
            System.out.println(" Şubesi :"+((Student)comingPerson).getBranch());
        }
        System.out.println();
    }



    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
