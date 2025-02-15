import java.util.Scanner;

public class hitungIP {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        double draftNilai15[][] = new double[2][8]; // angka dan bobot
        String draftHuruf15[][] = new String[1][8]; // nilai huruf
        String matkul15[][] = new String[1][8]; // mata kuliah
        matkul15[0][0] = "Pancasila"; matkul15[0][1] = "Konsep Teknologi Informasi"; matkul15[0][2] = "Critical Thinking dan Problem Solving"; matkul15[0][3] = "Matematika Dasar";
        matkul15[0][4] = "Rekayasa Perangkat Lunak"; matkul15[0][5] = "Dasar Pemrograman"; matkul15[0][6] = "Praktikum Dasar Pemrograman"; 
        matkul15[0][7] = "Keselamatan dan Kesehatan Kerja";
        
        double bobotSKS15[][] = new double[1][8]; // besaran SKS
        bobotSKS15[0][0] = 2; bobotSKS15[0][1] = 2; bobotSKS15[0][2] = 2; bobotSKS15[0][3] = 3; 
        bobotSKS15[0][4] = 2; bobotSKS15[0][5] = 2; bobotSKS15[0][6] = 3; bobotSKS15[0][7] = 2;

        System.out.println("=========================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=========================================");

        for (int i = 0; i < matkul15[0].length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkul15[0][i] + ": ");
            draftNilai15[0][i] = sc15.nextDouble();
        }

        System.out.println("=========================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=========================================");

        System.out.printf("%-35s %-15s %-15s %-15s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double bobotNilai15;
        String nilaiHuruf15;
        
        double totalNilaiBobot15 = 0;  
        double totalSKS15 = 0;       

        for (int i = 0; i < draftNilai15[0].length; i++) {
            if (draftNilai15[0][i] >= 85 && draftNilai15[0][i] <= 100) {
                bobotNilai15 = 4.0;
                nilaiHuruf15 = "A";
            } else if (draftNilai15[0][i] >= 80 && draftNilai15[0][i] < 85) {
                bobotNilai15 = 3.5;
                nilaiHuruf15 = "B+";
            } else if (draftNilai15[0][i] >= 70 && draftNilai15[0][i] < 80) {
                bobotNilai15 = 3.0;
                nilaiHuruf15 = "B";
            } else if (draftNilai15[0][i] >= 60 && draftNilai15[0][i] < 70) {
                bobotNilai15 = 2.5;
                nilaiHuruf15 = "C+";
            } else if (draftNilai15[0][i] >= 50 && draftNilai15[0][i] < 60) {
                bobotNilai15 = 2.0;
                nilaiHuruf15 = "C";
            } else if (draftNilai15[0][i] >= 40 && draftNilai15[0][i] < 50) {
                bobotNilai15 = 1.0;
                nilaiHuruf15 = "D";
            } else {
                bobotNilai15 = 0;
                nilaiHuruf15 = "E";
            }

            draftNilai15[1][i] = bobotNilai15;
            draftHuruf15[0][i] = nilaiHuruf15;

            // Tampilkan hasil konversi nilai
            System.out.printf("%-35s %-15.2f %-15s %-15.2f\n", matkul15[0][i], draftNilai15[0][i], nilaiHuruf15, bobotNilai15);

            totalNilaiBobot15 += bobotNilai15 * bobotSKS15[0][i];
            totalSKS15 += bobotSKS15[0][i];
        }

        double ip15 = totalNilaiBobot15 / totalSKS15;

        System.out.println("=========================================");
        System.out.printf("Indeks Prestasi (IP) Semester: %.2f\n", ip15);
    }
}
