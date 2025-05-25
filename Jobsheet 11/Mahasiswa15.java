public class Mahasiswa15{
    String nim, nama, kelas;
    double ipk;

    Mahasiswa15(){}

    Mahasiswa15(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + " | " + nim + " | " + kelas + " | " + ipk);
    }
}
