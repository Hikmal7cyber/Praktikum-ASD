public class Mahasiswa15{
    String nim, nama, kelas;
    int nilai;

    Mahasiswa15(){}

    Mahasiswa15(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}