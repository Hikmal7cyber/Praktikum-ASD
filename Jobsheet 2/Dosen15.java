public class Dosen15 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status aktif (true/false): " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Masa kerja: " + hitungMasaKerja(2025) + " tahun");

    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen15 () {
    }

    public Dosen15 (String idDosen, boolean stat, String nm, int thn, String bdg) {
        this.idDosen = idDosen;
        nama = nm;
        statusAktif = stat;
        tahunBergabung = thn;
        bidangKeahlian = bdg;
    }
}
