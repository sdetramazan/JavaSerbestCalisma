package Soru;

public class _08_Soru {
    public static void main (String[] args){
        //String olarak verlen 3 notun ("82", "95","56") ortalamasını bulunuz.
        String not1 ="82";
        String not2 ="95";
        String not3 ="56";

        double not01= Double.parseDouble(not1);
        double not02=Double.parseDouble(not2);
        double not03=Double.parseDouble(not3);

        double ortalamaNot=(not01+not02+not03)/3;
        System.out.println("ortalamaNot = " + ortalamaNot);
    }
}
