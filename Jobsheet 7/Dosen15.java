public class Dosen15 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen15(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Perempuan" : "Laki Laki"));
        System.out.println("Usia            : " + usia);
    }
}
