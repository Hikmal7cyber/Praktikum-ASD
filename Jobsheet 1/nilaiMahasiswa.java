import java.util.Scanner;
public class nilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        System.out.println("Program Hitung Nilai Akhir");
        System.out.println("============================");
        System.out.print("Masukkan Nilai Tugas: ");
        float tugas15 = sc15.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        float kuis15 = sc15.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        float uts15 = sc15.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        float uas15 = sc15.nextInt();
        System.out.println("============================");

        float operasiTugas15 = tugas15 * 20/100;
        float operasiKuis15 = kuis15 * 20/100;
        float operasiUTS15 = uts15 * 30/100;
        float operasiUAS15 = uas15 * 30/100;
        float hasilAkhir15 = operasiKuis15 + operasiTugas15 + operasiUTS15 + operasiUAS15;

        String nilaiHuruf15;
        if (hasilAkhir15 > 80 && hasilAkhir15 <= 100) {
            nilaiHuruf15 = "A";            
        } else if (hasilAkhir15 > 73 && hasilAkhir15 <= 80) {
            nilaiHuruf15 = "B+";
        } else if (hasilAkhir15 > 65 && hasilAkhir15 <= 73) {
            nilaiHuruf15 = "B";
        } else if (hasilAkhir15 > 60 && hasilAkhir15 <= 65) {
            nilaiHuruf15 = "C+";
        } else if (hasilAkhir15 > 50 && hasilAkhir15 <= 60) {
            nilaiHuruf15 = "C";
        } else if (hasilAkhir15 > 39 && hasilAkhir15 <= 50) {
            nilaiHuruf15 = "D";
        } else {
            nilaiHuruf15 = "E";
        }

        String status15;
        if (nilaiHuruf15.equals("A") || nilaiHuruf15.equals("B+") || 
        nilaiHuruf15.equals("B") || nilaiHuruf15.equals("C+") || nilaiHuruf15.equals("C")) {
            status15 = "LULUS";
        } else {
            status15 = "TIDAK LULUS";
        }

        System.out.println("============================");
        if (tugas15 > 100 || tugas15 < 0 || kuis15 > 100 || kuis15 < 0 || uts15 > 100 || uts15 < 0 || uas15 > 100 || uts15 < 0) {
            System.out.println("Nilai Tidak Valid!!");
        } else {
            System.out.println("Nilai akhir: " + hasilAkhir15);
            System.out.println("Nilai huruf: " + nilaiHuruf15);
        }

        System.out.println("============================");
        System.out.println("============================");
        if (tugas15 > 100 || tugas15 < 0 || kuis15 > 100 || kuis15 < 0 || uts15 > 100 || uts15 < 0 || uas15 > 100 || uts15 < 0) {
            System.out.println("");
        } else {
            System.out.println("SELAMAT ANDA " + status15);
        }
    }
}