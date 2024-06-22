package Class.Ornek_13;

public class Account {
   private int depositedMoney;
    private int withDrawnMoney;
    private int balance;

    public void totalDepositedMoney(int depositedMoney){
        this.depositedMoney+=depositedMoney;
        this.balance+= depositedMoney;}
    public void totalWithDarwMoney( int withDrawnMoney){
        this.withDrawnMoney+=withDrawnMoney;
        this.balance-=withDrawnMoney;}

    public String toString(){
       return  "Toplam Yatan :"+depositedMoney+"TL\n"+
              "Toplam Çekilen :"+withDrawnMoney+"TL\n"+
                "Bakiye :"+this.balance;
    }

}
