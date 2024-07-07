package Class.Inheritance.Ornek_01;

public class Ducks extends Animal{

    private int wingspan;

    public Ducks(String colour, int kilo ,String genus,int wingspan){
        super(colour,kilo,genus);
        setWingspan(wingspan);

    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }
    @Override
    public String toString(){
        return super.toString()+"\nkanat açıklığı:  "+wingspan;
    }

    @Override
    public void animalSpeak(){
        System.out.println("Ördek ses çıkardı");
        super.animalSpeak();
        System.out.println("vak vak");
    }
}
