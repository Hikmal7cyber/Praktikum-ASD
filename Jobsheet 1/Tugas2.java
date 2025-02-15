import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        Scanner input15 = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println("======= KALKULATOR UNTUK KUBUS =======");
            System.out.println("1. Volume; 2. Luas Permukaan; 3. Keliling");
            System.out.println("---------------------------------------");
            System.out.print("Masukkan sesuai nomor tertera: ");
            int pilih = input15.nextInt();
            
            if (pilih == 1) {
                System.out.println();
                System.out.println("------ Perhitungan Volume Kubus ------");
                System.out.print("Masukkan panjang rusuk: ");
                int angka1 = input15.nextInt();

                System.out.println("Volume kubus dengan rusuk sepanjang " + angka1 + " cm adalah: " + volKubus(angka1));
            } else if (pilih == 2) {
                System.out.println();
                System.out.println("------ Perhitungan Luas Pemukaan Kubus ------");
                System.out.print("Masukkan panjang rusuk: ");
                int angka2 = input15.nextInt();

                System.out.println("Luas permukaan kubus dengan panjang rusuk " + angka2  + " cm adalah: " + permukaan(angka2));
            } else if (pilih == 3) {
                System.out.println();
                System.out.println("------ Perhitungan Keliling Kubus ------");
                System.out.print("Masukkan panjang rusuk: ");
                int angka3 = input15.nextInt();
                
                System.out.println("Keliling kubus dengan panjang rusuk " + angka3 + " cm adalah: " + keliling(angka3));
            } else if (pilih == 0){
                System.out.println("------ Program Dihentikan! ------");
                break;
            } else {
                System.out.println("Pilihan tidak tersedia!");
            }
        }
            
    }

    static int volKubus (int x){
        int volume;
        volume = x * x * x;
        return volume;
    }

    static int permukaan (int x) {
        int luas;
        luas = 6 * x * x ;
        return luas;
    }

    static int keliling (int x) {
        int keliling;
        keliling = 12 * x ;
        return keliling;
    }
}
