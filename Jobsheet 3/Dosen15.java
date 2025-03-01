public class Dosen15 {
    public String kode15;
    public String nama15;
    public Boolean jenisKelamin1Boolean15; 
    public int usia15;

    public Dosen15(String kode15, String nama15, Boolean jenisKelamin15, int usia15) {
        this.kode15 = kode15;
        this.nama15 = nama15;
        this.jenisKelamin1Boolean15 = jenisKelamin15;
        this.usia15 = usia15;
    }

    public void tampilkanInfo() {
        String jenis15 = jenisKelamin1Boolean15 ? "Pria" : "Wanita"; 
        System.out.println("Kode            : " + kode15);
        System.out.println("Nama            : " + nama15);
        System.out.println("Jenis Kelamin   : " + jenis15);
        System.out.println("Usia            : " + usia15);
        System.out.println("-------------------------");
    }
}
