package Soru;

public class _06_Soru {
    public static void main(String[] args){
        //Soru 3: String olarak verilen 3 taksit bilgisinin ortalamasını(ondalıklı olarak) bulunuz.("150","185","95")
        String taksit1="150";
        String taksit2="185";
        String taksit3="95";
        
        double taksit01 =Double.parseDouble(taksit1);
        double taksit02=Double.parseDouble(taksit2);
        double taksit03=Double.parseDouble(taksit3);
        
        double ortTaksit=(taksit01+taksit02+taksit03)/3;
        System.out.println("ortTaksit = " + ortTaksit);
        
        
    }
}
