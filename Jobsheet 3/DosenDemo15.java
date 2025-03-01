import java.util.Scanner;

public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        Dosen15[] arrayofDosen15 = new Dosen15[3];

        System.out.println("============== INPUT INFORMASI DOSEN ==============");

        for (int i = 0; i < arrayofDosen15.length; i++) {
            System.out.println("Masukkan informasi dosen ke-" + (i + 1) + ":");
            System.out.print("Kode                             : ");
            String kode15 = sc15.nextLine();
            System.out.print("Nama                             : ");
            String nama15 = sc15.nextLine();
            System.out.print("Jenis Kelamin(true=lk, false=pr) : ");
            boolean jenisKelamin15 = sc15.nextBoolean();
            System.out.print("Usia                             : ");
            int usia15 = sc15.nextInt();
            System.out.println("----------------------------------------------------");
            sc15.nextLine(); 

            arrayofDosen15[i] = new Dosen15(kode15, nama15, jenisKelamin15, usia15);
        }

        System.out.println("======= DAFTAR INFORMASI DOSEN =======");
        for (Dosen15 dosen : arrayofDosen15) {
            dosen.tampilkanInfo();
        }

        DataDosen15.dataSemuaDosen(arrayofDosen15);
        DataDosen15.jumlahDosenPerJenisKelamin(arrayofDosen15);
        DataDosen15.rerataUsiaDosenPerJenisKelamin(arrayofDosen15);
        DataDosen15.infoDosenPalingTua(arrayofDosen15);
        DataDosen15.infoDosenPalingMuda(arrayofDosen15);
    }
}


