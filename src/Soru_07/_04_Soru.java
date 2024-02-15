package Soru_07;

import java.util.Random;

public class _04_Soru {
    public static void main(String[] args) {

    // TODO : gunun sorusu : 5 tv kanalı ismini bir diziye doldurunuz. trt, kanald,atv,fox,habertürk
    //  bir döngü ile 5 tane rastgele buldurunuz
    // TODO : fakat bir buldugunu tekrar bulmasın

        String[] values ={"trt","kanald","atv","fox","habertürk"};
        boolean[] usedFlags =new boolean[values.length];
        int count=0;
        Random random=new Random();
        while (count< values.length){
            int randomIndex= random.nextInt(values.length);
            if (!(usedFlags[randomIndex])){
                String selectedValue=values[randomIndex];
                usedFlags[randomIndex]=true;
                count++;
                System.out.println(count+". seçilen tv = " + selectedValue);

            }
        }



        }
}


