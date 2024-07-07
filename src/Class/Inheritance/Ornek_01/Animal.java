package Class.Inheritance.Ornek_01;

public class Animal {
    private String colour;
    private int kilo;
    private String genus;
    public Animal(String colour, int kilo ,String genus){
        setColour(colour);
        setKilo(kilo);
        setGenus(genus);

    }

    public void animalSpeak(){
        System.out.println("Ses çıkardı");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }


    @Override
    public String toString(){
        return "\nRengi :"+colour+
               "\nkilosu :"+kilo+
                "\ncinsi :"+genus;
    }
}
