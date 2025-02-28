import java.util.Scanner;

public class MatakuliahDemo15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        
        Matakuliah15[] arrayOfMatakuliah = new Matakuliah15[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = sc15.nextLine();
            System.out.print("Nama          : ");
            nama = sc15.nextLine();
            System.out.print("SKS           : ");
            dummy = sc15.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam    : ");
            dummy = sc15.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            arrayOfMatakuliah[i] = new Matakuliah15(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode          : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama          : " + arrayOfMatakuliah[i].nama);
            System.out.println("SKS           : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah jam    : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("---------------------------------------------");
        }
    }
}
