package Class.Ornek_13;

public class Bank {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.customerNumber=1;
        customer.name="Ramazan";
        customer.surName="İnce";
        customer.account.totalDepositedMoney(100);
        customer.account.totalDepositedMoney(200);
        customer.account.totalWithDarwMoney(50);
        customer.account.totalWithDarwMoney(150);

        System.out.println(customer.account.toString());

    }
}
