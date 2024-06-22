package Class.Ornek_16;

public class Vatandas {
    String name;
    String adress;
    final int id;
    private static int sayac=1;

    public Vatandas(String name, String adress){
        this.id=sayac++;
        this.name=name;
        this.adress=adress;
    }
    public String toString(){
       return this.id+"\n"+
               this.name+"\n"+
               this.adress;

    }

}
