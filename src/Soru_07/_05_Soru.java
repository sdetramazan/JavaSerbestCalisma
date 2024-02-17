package Soru_07;

public class _05_Soru {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan
        // Random atayarak doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1,
        // çift olanlara 0 atayınız  yazdırınız.

        int[] number =new int[50];

        for (int i = 0; i < number.length; i++) {
            int randomValues = (int) (Math.random() * 10);
            number[i]=randomValues;
            System.out.println(i+1+". sayı : " + number[i]);

        }
        for (int i = 0; i < number.length; i++) {
            if (number[i]%2==1){
                System.out.println(number[i]+" tek sayı olduğundan aldığı değer 1");
            }else
                System.out.println(number[i]+" çif sayı olduğundan aldığı değer 0");

        }
    }
}
