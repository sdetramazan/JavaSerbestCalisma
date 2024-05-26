package Class.Ornek_12;

public class Employee {

    int id;
    String name;
    String surName;
    private String password;

    public void enterPassword(String password){
        if (password.length()<8){
            System.out.println("Zayıf şifre");
        }else {
            this.password = password;
            System.out.println("Şifre oluşturuldu");
        } }
    public void showPassword(){
        System.out.println("****"+this.password.substring(4));
    }
}
