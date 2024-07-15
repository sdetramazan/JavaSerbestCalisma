package Class.Inheritance.Ornek_04;

public class LiseStudent extends Student {

    private String brans;

    public LiseStudent( String firstName, String brans){
        super(firstName, OgrTip.LISE);
        setBrans(brans);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
    @Override
    public String toString(){
        return super.toString()+"\nBranşı :"+this.brans;
    }
}
