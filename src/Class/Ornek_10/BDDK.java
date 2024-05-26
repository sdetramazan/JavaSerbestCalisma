package Class.Ornek_10;

public class BDDK {

    public static void main(String[] args){
        Bank bank=new Bank();
        bank.bankName="Vakıf bank";
        bank.establishmentYear=1980;
        bank.branchQuantity=5;

        Bank bank1=new Bank("Ziraat",5,1977);
        Bank bank2=new Bank("iş bankası",7);

        System.out.println(bank);
        System.out.println("*******");
        System.out.println(bank1);
        System.out.println("*******");
        System.out.println(bank2);



    }
}
