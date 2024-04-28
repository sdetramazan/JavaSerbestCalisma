package Class.Ornek_05;

public class Person {
    String name;
    String surName;
    int age;

    public  String toString(){
       String print =this.name+"\n"+this.surName+"\n"+this.age;
       return print;
    }

    public int getBirthYear(){
        int yil=2023-this.age;
        return yil;
    }


}


