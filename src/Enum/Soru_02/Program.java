package Enum.Soru_02;

public class Program {
    public static void main(String[] args) {
        User user = new User("Ramazan",ERolu.ADMIN,EStatus.AKTIF);
        User user1= new User("Betül",ERolu.SATIS,EStatus.PASIF);
        User user2=new User("Ebrar",ERolu.MUDUR,EStatus.AKTIF);

        User.userDelete(user);

    }
}
