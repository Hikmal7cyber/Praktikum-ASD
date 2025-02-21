public class MahasiswaMain15 {
    public static void main(String[] args) {
        Mahasiswa15 mhs1 = new Mahasiswa15 ();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        System.out.println();
        mhs1.tampilkanInformasi();

        System.out.println();
        Mahasiswa15 mhs2 = new Mahasiswa15("Annisa Nabila","2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        System.out.println();
        Mahasiswa15 mhsHikmal = new Mahasiswa15("Muhammad Hikmal","244107020074",3.78,"TI 1B");
        mhsHikmal.tampilkanInformasi();
        mhsHikmal.updateIpk(5.0);
        mhsHikmal.tampilkanInformasi();
    }
}
