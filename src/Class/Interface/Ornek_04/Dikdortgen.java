package Class.Interface.Ornek_04;

public class Dikdortgen implements IBase {


    @Override
    public double cevre(double a, double b) {
        return (a+b)*2;
    }

    @Override
    public double alan(double a, double b) {
        return a*b;
    }
}
