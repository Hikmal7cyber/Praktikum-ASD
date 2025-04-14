import java.util.Scanner;

public class DosenMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        DataDosen15 data = new DataDosen15(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (P/L): ");
            char jk = sc.next().charAt(0);
            boolean jenisKelamin = (jk == 'P' || jk == 'p');
            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();

            Dosen15 d = new Dosen15(kode, nama, jenisKelamin, usia);
            data.tambah(d);
        }

        System.out.println();

        System.out.println("Data Dosen Sebelum Sorting: ");
        data.tampil();

        System.out.println("Data Dosen Termuda - Tertua 'BUBBLE SORT': ");
        data.ascendingBubbleSort();
        data.tampil();

        System.out.println("Data Dosen Tertua - Termuda 'SELECTION SORT': ");
        data.descendingSelectionSort();
        data.tampil();

        System.out.println("\n--- PENCARIAN NAMA DOSEN (SEQUENTIAL SEARCH) ---");
        System.out.print("Masukkan nama dosen yang ingin dicari: ");
        String namaCari = sc.nextLine();
        data.pencarianDataSequential15(namaCari);

        System.out.println("\n--- PENCARIAN BINARY USIA (BINARY SEARCH) ---");
        System.out.print("Masukkan usia dosen yang ingin dicari: ");
        int usiaCari = sc.nextInt();
        sc.nextLine();
        data.ascendingBubbleSort();
        data.pencarianDataBinary15(usiaCari);
    }
}
