package Class.Inheritance.Ornek_04;

public class ilkStudent extends Student{
    private String klup;

    public ilkStudent(String firstName, String klup){
        super(firstName,OgrTip.ILK);
        setKlup(klup);
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }
    @Override
    public String toString(){
        return super.toString()+"\nKlup :"+this.klup;
    }
}
