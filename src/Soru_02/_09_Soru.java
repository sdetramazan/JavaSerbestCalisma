package Soru_02;

import java.util.Scanner;

public class _09_Soru {
    public static void main (String[] args){

//Girilen bir Ay numarasına göre bir ayın kaç gün sürdüğünü bulunuz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("ay no giriniz= ");
        int ayNo = scanner.nextInt();

        switch (ayNo){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println(+ayNo +". ay  Otuzbir gün çekiyor"); break;
            case 2 :
                System.out.println(+ayNo +". ay yirmi sekiz gün çekiyor"); break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println(+ayNo +". ay Otuz gün çekiyor"); break;
            default:
                System.out.println("hatalı giriş yaptınız");
        }
    }
}
