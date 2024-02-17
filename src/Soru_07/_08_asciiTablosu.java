package Soru_07;

public class _08_asciiTablosu {
    public static void main(String[] args) {

        //ascii tablosunu yazdıralım.

        for (int i = 0; i < 255; i++) {
            char letter =(char) i;
            System.out.println("Ascii kodu "+i+" olan Harf = " + letter);
        }

    }
}
