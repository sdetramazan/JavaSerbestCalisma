package Class.Ornek_10;

public class Bank {
    String bankName;
    int branchQuantity;
    int establishmentYear;

    public Bank(){

    }
    public Bank(String bankName,int branchQuantity,int establishmentYear){
        this.bankName=bankName;
        this.establishmentYear=establishmentYear;
        this.branchQuantity=branchQuantity;
    }
    public Bank(String bankName, int branchQuantity){
        this(bankName,branchQuantity,0);
    }
    public String toString(){return ("Banka adı: "+this.bankName+"\nŞube Sayısı: "+this.branchQuantity+"\nKuruluş Yılı: "+this.establishmentYear);}
}
