import java.util.Scanner;

public class SLLMain15 {
    public static void main(String[] args) {

        Scanner sc15 = new Scanner(System.in);

        SingleLinkedList15 sll = new SingleLinkedList15();

        Mahasiswa15 mhs1 = new Mahasiswa15("2201", "Alvaro", "TI-1A", 3.8);
        Mahasiswa15 mhs2 = new Mahasiswa15("2202", "Bimon", "TI-1B", 3.5);
        Mahasiswa15 mhs3 = new Mahasiswa15("2203", "Cintia", "TI-1A", 3.9);
        Mahasiswa15 mhs4 = new Mahasiswa15("2204", "Dirga", "TI-1B", 3.6);

        sll.print();

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.print();

        sll.insertAt(2, mhs2);
        sll.print();

        while (true) {
            System.out.print("Tambah data baru? (y/n): ");
            String jawab = sc15.nextLine();

            if (jawab.equalsIgnoreCase("y")) {
                System.out.println("----- INPUT DATA -----");
                System.out.print("Masukkan nama: ");
                String nama = sc15.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = sc15.nextLine();
                System.out.print("Masukkan kelas: ");
                String kelas = sc15.nextLine();
                System.out.print("Masukkan IPK: ");
                double ipk = sc15.nextDouble();
                Mahasiswa15 mhs = new Mahasiswa15(nim, nama, kelas, ipk);

                System.out.println();

                System.out.println("Silahkan pilih menu: ");
                System.out.println("1. Menambahkan data Diawal");
                System.out.println("2. Menambahkan data Setelah Nama Tertentu");
                System.out.println("3. Menambahkan data di index tertentu");
                System.out.println("4. Menambahkan data di Akhir");
                System.out.print("Pilihan : ");
                int pilih = sc15.nextInt();
                sc15.nextLine();
                switch (pilih) {
                case 1:
                    sll.addFirst(mhs);
                    sll.print();
                    break;
                case 2:
                    System.out.print("Input data setelah: ");
                    String dicari = sc15.nextLine();
                    sll.insertAfter(dicari, mhs);
                    sll.print();
                    break;
                case 3: 
                    System.out.print("Posisi index yang diinginkan: ");
                    int index = sc15.nextInt();
                    sc15.nextLine();
                    sll.insertAt(index, mhs);
                    sll.print();
                    break;
                    case 4:
                    sll.addLast(mhs);
                    sll.print();
                    break;
                 default:
                    break;
                }
            } else if(jawab.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Tidak Valid, jawab dengan Y/N");
            }
        }
    }
}
