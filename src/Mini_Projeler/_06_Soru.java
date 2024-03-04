package Mini_Projeler;

public class _06_Soru {
    // istenilen sayı kadar toplama yaptırabilme
    public static void main(String[] args) {


        int n1 = 2;
        int n2 = 3;
        int n3 = 4;
        int n4 = 5;
        System.out.println(total(n1,n2));
        System.out.println(total(n1,n2,n3));
        System.out.println(total(n1,n2,n3,n4));

    }
    public static int total(int... array){
        int total1=0;

        for (int i = 0; i < array.length; i++) {
            total1+=array[i];
        }
        return total1;
    }
}
