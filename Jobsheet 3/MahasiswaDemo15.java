public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Mahasiswa15 [] arrayofMahasiswa15 = new Mahasiswa15[3];

        arrayofMahasiswa15 [0] = new Mahasiswa15();
        arrayofMahasiswa15 [0].nim = "244107060033";
        arrayofMahasiswa15 [0].nama = "AGNES TITANIA KINANTI";
        arrayofMahasiswa15 [0].kelas = "SIB - 1E";
        arrayofMahasiswa15 [0].ipk = (float) 3.75;

        arrayofMahasiswa15 [1] = new Mahasiswa15();
        arrayofMahasiswa15 [1].nim = "2341720172";
        arrayofMahasiswa15 [1].nama = "ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa15 [1].kelas = "TI - 2A";
        arrayofMahasiswa15 [1].ipk = (float) 3.36;

        arrayofMahasiswa15 [2] = new Mahasiswa15();
        arrayofMahasiswa15 [2].nim = "244107023006";
        arrayofMahasiswa15 [2].nama = "DIRHAMAWAN PUTRANTORO";
        arrayofMahasiswa15 [2].kelas = "TI - 2E";
        arrayofMahasiswa15 [2].ipk = (float) 3.80;

        System.out.println("NIM       : " + arrayofMahasiswa15[0].nim);
        System.out.println("Nama      : " + arrayofMahasiswa15[0].nama);
        System.out.println("Kelas     : " + arrayofMahasiswa15[0].kelas);
        System.out.println("IPK       : " + arrayofMahasiswa15[0].ipk);
        System.out.println("---------------------------------------------");
        System.out.println("NIM       : " + arrayofMahasiswa15[1].nim);
        System.out.println("Nama      : " + arrayofMahasiswa15[1].nama);
        System.out.println("Kelas     : " + arrayofMahasiswa15[1].kelas);
        System.out.println("IPK       : " + arrayofMahasiswa15[1].ipk);
        System.out.println("---------------------------------------------");
        System.out.println("NIM       : " + arrayofMahasiswa15[2].nim);
        System.out.println("Nama      : " + arrayofMahasiswa15[2].nama);
        System.out.println("Kelas     : " + arrayofMahasiswa15[2].kelas);
        System.out.println("IPK       : " + arrayofMahasiswa15[2].ipk);
        System.out.println("---------------------------------------------");

    }
}
