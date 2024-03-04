package JavaMethot;

public class _10_Soru {
    //Soru5- Girilen bir diziyi tersten yazdıran programı yazınız.
    //Örnek girdi:"m","a","l","e","s"
    //Çıktı: "selam"
    public static void main(String[] args) {
        String[] characters={"m","a","l","e","s"};
        reverseArr(characters);
    }
    public static void reverseArr(String[] character){

        for (int i = 1; i <= character.length; i++) {
            System.out.print(character[character.length-i]);

        }
    }
}

