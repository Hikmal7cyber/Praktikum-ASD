public class MataKuliahMain15 {
    public static void main(String[] args) {
        MataKuliah15 matkul1 = new MataKuliah15();
        matkul1.kodeMK = "RTI242009";
        matkul1.nama = "Praktikum Algoritma Dan Struktur Data";
        matkul1.sks = 3;
        matkul1.jumlahJam = 6;
        matkul1.tampilInformasi();

        System.out.println();
        matkul1.tambahJam(2);
        matkul1.ubahSKS(5);
        matkul1.kurangiJam(5);
        matkul1.tampilInformasi();

        System.out.println();

        MataKuliah15 matkul2 = new MataKuliah15("RTI242008","Algoritma Dan Struktur Data", 2, 4);
        matkul2.tampilInformasi();

        System.out.println();
        matkul2.kurangiJam(3);
        matkul2.tampilInformasi();
    }
}
