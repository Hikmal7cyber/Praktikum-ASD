import java.util.Scanner;

public class Matakuliah15 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah15() {
    }

    public Matakuliah15 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tambahData() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kode          : ");
        this.kode = sc.nextLine();
        System.out.print("Nama          : ");
        this.nama = sc.nextLine();
        System.out.print("SKS           : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah jam    : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
    }
}
