package Soru_02;

import java.util.Scanner;

public class _06_Soru {
    public static void main (String[] args){
//kullanıcının girdiği gün numarasına karşılık gelen günü adını yazınız
        //2 veya 3 seçenek if, ternary kullanılır
        //3 den fazla ise switch

        Scanner scanner =new Scanner(System.in);
        System.out.print("gün numarası gir=");
        int gunNo=scanner.nextInt();

        switch (gunNo){
            case 1: System.out.println("pazartesi"); break;
            case 2: System.out.println("salı"); break;
            case 3: System.out.println("çarşamba"); break;
            case 4: System.out.println("perşembe"); break;
            case 5: System.out.println("cuma"); break;
            case 6: System.out.println("cumartesi"); break;
            case 7: System.out.println("pazar"); break;
            default:
                System.out.println("hatalı giriş yaptız");
        }
    }
}
