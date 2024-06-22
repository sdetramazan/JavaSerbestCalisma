package Enum.Soru_02;

public class User {
    String userName;
    ERolu rolu;
    EStatus status;

    public static void userDelete(User user){
        if (user.rolu==ERolu.ADMIN){
            System.out.println("Admin silinemez.");
        }else {
            System.out.println("User silindi");
        }
    }

    public User(String userName,ERolu rolu,EStatus status){
        this.userName=userName;
        this.rolu=rolu;
        this.status=status;
    }
    public String toString(){
        return "Kullanıcının:\n"+
                "User Name"+this.userName+
                "\nYetkisi :"+this.rolu+
                "\nStatusü :"+this.status;
    }
}
