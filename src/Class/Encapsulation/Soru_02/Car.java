package Class.Encapsulation.Soru_02;

public class Car {
   private String renk;
   private int model;
   private int motorHacmi;
   private int kapiSayisi;

   public Car(){

   }
   public Car(String renk,int model,int motorHacmi,int kapiSayisi){
       setRenk(renk);
       setModel(model);
       setMotorHacmi(motorHacmi);
       setKapiSayisi(kapiSayisi);
   }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi < 7) {
            this.kapiSayisi = kapiSayisi;
        }else
            System.out.println("Hatalı giriş yapıldı");
    }
    public String toString(){
       return "Aracın"+" \nRengi :"+getRenk()+"\n Modeli "+
               getModel()+"\n Hacmi "+
               getMotorHacmi()+"\n Kapı Sayısı "+
               getKapiSayisi();
    }
}
