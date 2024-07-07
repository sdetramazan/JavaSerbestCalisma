package Class.Inheritance.Ornek_01;

public class Snakes extends Animal{
    private int length;

    public Snakes(String colour, int kilo ,String genus,int length){
        super(colour,kilo,genus);
       setLength(length);

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public String toString(){
        return super.toString()+" \nUzunluğu :"+length;
    }

    @Override
    public void animalSpeak(){
        System.out.println("Yılan işlemleri");
        super.animalSpeak();
        System.out.println("tısladı");
    }
}
