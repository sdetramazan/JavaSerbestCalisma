package JavaMethot;

public class _10_Soru {
    //Soru5- Girilen bir diziyi tersten yazdıran programı yazınız.
    //Örnek girdi:"m","a","l","e","s"
    //Çıktı: "selam"
    public static void main(String[] args) {
        String[] character = {"m", "a", "l", "e", "s"};
        word(character);
    }
    public static String word(String[] character){
        String charact="";
        for (int i = 0; i < character.length; i++) {
         charact=  character[(character.length-1)-i];
            System.out.print( charact);
        }
        return  charact;
    }

}

