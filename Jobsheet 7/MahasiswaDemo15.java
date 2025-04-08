import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa15 m = new Mahasiswa15(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();

       // System.out.println("Data Mahasiswa Sebelum Sorting: ");
       // list.tampil();

        //System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        //list.bubbleSort();
        //list.tampil();

        //System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        //list.selectionSort();
        //list.tampil();

        //System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        //list.insertionSort();
        //list.tampil();


        System.out.println("----------------------");
        System.out.println("Pencarian Data Sequential Search");
        System.out.println("----------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("----------------------");
        System.out.println("Pencarian Data Binary Search");
        System.out.println("----------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari2 = sc.nextDouble();

        System.out.println("Menggunakan Binary Search");
        double posisi2 = list.findBinarySearch(cari, 0, jumlah-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }   
}
