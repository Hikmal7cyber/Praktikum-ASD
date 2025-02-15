import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        char[] kode15 = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};   // Kode plat

        String[][] kota15 = { // Kota
            {"BANTEN"},
            {"JAKARTA"},
            {"BANDUNG"},
            {"CIREBON"},
            {"BOGOR"},
            {"PEKALONGAN"},
            {"SEMARANG"},
            {"SURABAYA"},
            {"MALANG"},
            {"TEGAL"}
        };

        boolean lanjutkan = true;
        while (lanjutkan) {
            System.out.println("================== PENCARIAN KODE PLAT ==================");
            System.out.print("Masukkan kode plat mobil (A, B, D, E, F, G, H, L, N, T): ");
            char inputKode15 = sc15.next().charAt(0);

            boolean found = false;
            for (int i = 0; i < kode15.length; i++) {
                if (kode15[i] == inputKode15) {
                    System.out.println("Nama Kota untuk kode plat " + inputKode15 + " adalah: " + kota15[i][0]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Kode plat tidak ditemukan.");
            }

            System.out.print("Apakah Anda ingin memasukkan kode plat lain? (y/n): ");
            char lanjut = sc15.next().charAt(0);
            if (lanjut == 'n' || lanjut == 'N') {
                lanjutkan = false;
                System.out.println("----- Program Dihentikan -----");
            }
        }

    }
}
