package Class.Ornek_06;

public class Rectangle {

    int width;
    int length;

    public int cevre(){
        return (this.length+this.width)*2;
    }

    public int alan(){
        return (this.width*this.length);
    }

    public int cevre1(int width, int length){
        return ((this.width=width)+(this.length=length))*2;
    }

}
