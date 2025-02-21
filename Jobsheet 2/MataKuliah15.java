public class MataKuliah15 {
    String kodeMK, nama;
    int sks, jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam bertambah menjadi " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam > jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam telah dikurangi menjadi " + jumlahJam + " jam.");
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan.");
        }
    }

    public MataKuliah15() {
    }

    public MataKuliah15(String kd, String nm, int sks, int jml) {
        kodeMK = kd;
        nama = nm;
        this.sks = sks;
        jumlahJam = jml;
    }
}
