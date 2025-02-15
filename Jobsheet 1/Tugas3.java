import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah15 = sc15.nextInt();
        sc15.nextLine();

        String[] namaMataKuliah15 = new String[jumlah15];
        int[] sks15 = new int[jumlah15];
        int[] semester15 = new int[jumlah15];
        String[] hariKuliah15 = new String[jumlah15];

        for (int i = 0; i < jumlah15; i++) {
            System.out.println("Mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah15[i] = sc15.nextLine();
            System.out.print("Jumlah SKS: ");
            sks15[i] = sc15.nextInt();
            System.out.print("Semester: ");
            semester15[i] = sc15.nextInt();
            System.out.print("Hari Kuliah: ");
            sc15.nextLine(); 
            hariKuliah15[i] = sc15.nextLine();
        }

        while (true) {
            System.out.println("=================== Draft Jadwal Kuliah ===================");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal berdasarkan semester tertentu");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.print("Pilih opsi (1-4), 5 untuk keluar: ");
            int opsi15 = sc15.nextInt();
            sc15.nextLine(); 
    
            switch (opsi15) {
                case 1:
                    tampilkanSeluruhJadwal15(namaMataKuliah15, sks15, semester15, hariKuliah15);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari15 = sc15.nextLine();
                    tampilkanJadwalBerdasarkanHari15(namaMataKuliah15, sks15, semester15, hariKuliah15, hari15);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem15 = sc15.nextInt();
                    tampilkanJadwalBerdasarkanSemester15(namaMataKuliah15, sks15, semester15, hariKuliah15, sem15);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String namaDicari15 = sc15.nextLine();
                    cariMataKuliah15(namaMataKuliah15, sks15, semester15, hariKuliah15, namaDicari15);
                    break;
                case 5:
                    System.out.println("------ Program Dihentikan! ------");
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia. Coba lagi!");
            }

            System.out.println("------ Program Dihentikan! ------");
        }
    }

    public static void tampilkanSeluruhJadwal15(String[] nama15, int[] sks15, int[] semester15, String[] hari15) {
        for (int i = 0; i < nama15.length; i++) {
            System.out.println("Mata Kuliah: " + nama15[i] + ", SKS: " + sks15[i] + ", Semester: " + semester15[i] + ", Hari: " + hari15[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari15(String[] nama15, int[] sks15, int[] semester15, String[] hari15, String hariDicari15) {
        boolean dataDitemukan = false;
        for (int i = 0; i < nama15.length; i++) {
            if (hari15[i].equalsIgnoreCase(hariDicari15)) {
                System.out.println("Mata Kuliah: " + nama15[i] + ", SKS: " + sks15[i] + ", Semester: " + semester15[i]);
                dataDitemukan = true;
            }
        }
        if (!dataDitemukan) {
            System.out.println("Data tidak ada.");
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester15(String[] nama15, int[] sks15, int[] semester15, String[] hari15, int semesterDicari15) {
        boolean dataDitemukan = false;
        for (int i = 0; i < nama15.length; i++) {
            if (semester15[i] == semesterDicari15) {
                System.out.println("Mata Kuliah: " + nama15[i] + ", SKS: " + sks15[i] + ", Hari: " + hari15[i]);
                dataDitemukan = true;
            }
        }
        if (!dataDitemukan) {
            System.out.println("Data tidak ada.");
        }
    }

    public static void cariMataKuliah15(String[] nama15, int[] sks15, int[] semester15, String[] hari15, String namaDicari15) {
        boolean dataDitemukan = false;
        for (int i = 0; i < nama15.length; i++) {
            if (nama15[i].equalsIgnoreCase(namaDicari15)) {
                System.out.println("Mata Kuliah: " + nama15[i] + ", SKS: " + sks15[i] + ", Semester: " + semester15[i] + ", Hari: " + hari15[i]);
                dataDitemukan = true;
                return;
            }
        }
        if (!dataDitemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
