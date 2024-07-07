package Class.Inheritance.Ornek_01;

public class AnimalMain {
    public static void main(String[] args) {
        Cats cats=new Cats("beyaz",15,"van");
        System.out.println("\nKedinin: "+cats);
        Dogs dogs=new Dogs("Siyah",18,"Sivas");
        System.out.println("\nKöpeğin: "+dogs);
        Snakes snakes=new Snakes("turuncu",5,"sürüngen",7);
        System.out.println("\nsnakes : " + snakes+"\n");
        snakes.animalSpeak();
        Ducks ducks=new Ducks("kahve",11,"şahin",20);
        System.out.println("\nducks : " + ducks);
        ducks.animalSpeak();
    }
}
