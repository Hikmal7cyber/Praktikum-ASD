import java.util.Scanner;

public class MatakuliahDemo15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Matakuliah: ");
        int jumlahMatkul = sc15.nextInt();
        sc15.nextLine();

        Matakuliah15[] arrayOfMatakuliah = new Matakuliah15[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMasukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah15();
            arrayOfMatakuliah[i].tambahData();
        }

        System.out.println();
        System.out.println("Data Mata Kuliah yang telah diinput:");
            for (int i = 0; i < jumlahMatkul; i++) {
                System.out.println("Data Matakuliah ke-" + (i + 1));
                System.out.println("Kode          : " + arrayOfMatakuliah[i].kode);
                System.out.println("Nama          : " + arrayOfMatakuliah[i].nama);
                System.out.println("SKS           : " + arrayOfMatakuliah[i].sks);
                System.out.println("Jumlah jam    : " + arrayOfMatakuliah[i].jumlahJam);
                System.out.println("---------------------------------------------");
            }
    }
}
