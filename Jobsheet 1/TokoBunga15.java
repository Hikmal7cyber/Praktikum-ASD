import java.util.Scanner;

public class TokoBunga15 {
    public static int[][] stok15 = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };

    public static int[] harga15 = {75000, 50000, 60000, 10000}; // Aglonema, Keladi, Alocasia, Mawar

    public static void main(String[] args) {
        tampilkanPendapatan15();
        hitungStokRoyalGarden415();
    }

    public static void tampilkanPendapatan15() {
        String[] cabang15 = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        for (int i = 0; i < cabang15.length; i++) {
            int pendapatan15 = 0;
            for (int j = 0; j < stok15[i].length; j++) {
                pendapatan15 += stok15[i][j] * harga15[j];
            }
            System.out.println("Pendapatan " + cabang15[i] + ": Rp " + pendapatan15);
        }
    }

    // Fungsi RoyalGarden 4 
    public static void hitungStokRoyalGarden415() {
        int[] pengurangan15 = {-1, -2, 0, -5}; // Pengurangan stok
        int[] stokAkhir15 = new int[stok15[3].length];

        for (int i = 0; i < stok15[3].length; i++) {
            stokAkhir15[i] = stok15[3][i] + pengurangan15[i];
        }

        System.out.println("Stok akhir di RoyalGarden 4:");
        System.out.println("Aglonema: " + stokAkhir15[0]);
        System.out.println("Keladi: " + stokAkhir15[1]);
        System.out.println("Alocasia: " + stokAkhir15[2]);
        System.out.println("Mawar: " + stokAkhir15[3]);
    }
}
