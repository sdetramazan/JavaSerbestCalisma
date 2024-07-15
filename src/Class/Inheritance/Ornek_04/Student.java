package Class.Inheritance.Ornek_04;

public class Student {
    private int id;
    private String firstName;
    private OgrTip tip;

    private static int sayacID=1;

    public Student(String firstName,OgrTip tip){
        setFirstName(firstName);
        setId(sayacID++);
        setTip(tip);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public OgrTip getTip() {
        return tip;
    }

    public void setTip(OgrTip tip) {
        this.tip = tip;
    }
    @Override
    public String toString(){
        return "Öğrencinin \nid no :"+this.id+
                "\nAdı :"+this.firstName+
                "\nSınıfı :"+this.tip;
    }
}
