package Soru;

public class _05_Soru {
    public static void main(String[] args){
        //Soru 2: String olarak verilen 3 adet paranın toplamını bulunuz ("100", "200", 300)
        
        String para1="100";
        String para2 ="200";
        String para3 ="300";
        
        int para01=Integer.parseInt(para1);
        int para02=Integer.parseInt(para2);
        int para03=Integer.parseInt(para3);
        
        int toplam =para01+para02+para03;
        System.out.println("toplam = " + toplam);


    }
}
