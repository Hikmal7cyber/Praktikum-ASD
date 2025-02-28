import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        Mahasiswa15 [] arrayofMahasiswa15 = new Mahasiswa15[3];
        String dummy;

       for (int i = 0; i < 3; i++) {
            arrayofMahasiswa15[i] = new Mahasiswa15();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM         : ");
            arrayofMahasiswa15[i].nim = sc15.nextLine();
            System.out.print("Nama        : ");
            arrayofMahasiswa15[i].nama = sc15.nextLine();
            System.out.print("Kelas       : ");
            arrayofMahasiswa15[i].kelas = sc15.nextLine();
            System.out.print("IPK         : ");
            dummy = sc15.nextLine();
            arrayofMahasiswa15[i].ipk = Float.parseFloat(dummy);
            System.out.println("--------------------------------------------------------");
       }

       for (int i = 0; i < 3; i++) {
           System.out.println("Data Mahasiswa ke-" + (i+1));
           arrayofMahasiswa15[i].cetakInfo();
       }

    }
}
