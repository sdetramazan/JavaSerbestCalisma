package Soru_07;

public class _11_Arrays_Soru {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        int[][] table = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = (int) (Math.random() * 10);

            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
               System.out.print(table[i][j]);
            }
            System.out.println();
        }
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] % 2 != 0) {
                    count++;
                }

            }

        }
        System.out.println("Tablodaki tek sayı miktarı = " + count);
    }
}
