public class DataDosen15 {
    static void dataSemuaDosen(Dosen15[] arrayOfDosen) {
        System.out.println("=== Data Semua Dosen ===");
        for (Dosen15 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();
        }
    }

    static void jumlahDosenPerJenisKelamin(Dosen15[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen15 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin1Boolean15) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("=== Jumlah Dosen Berdasarkan Jenis Kelamin ===");
        System.out.println("Pria  : " + pria);
        System.out.println("Wanita: " + wanita);
    }

    static void rerataUsiaDosenPerJenisKelamin(Dosen15[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;
        for (Dosen15 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin1Boolean15) {
                totalPria += dosen.usia15;
                countPria++;
            } else {
                totalWanita += dosen.usia15;
                countWanita++;
            }
        }
        System.out.println("=== Rata-Rata Usia Dosen ===");
        System.out.println("Pria  : " + (countPria > 0 ? (double) totalPria / countPria : 0));
        System.out.println("Wanita: " + (countWanita > 0 ? (double) totalWanita / countWanita : 0));
    }

    static void infoDosenPalingTua(Dosen15[] arrayOfDosen) {
        Dosen15 tertua = arrayOfDosen[0];
        for (Dosen15 dosen : arrayOfDosen) {
            if (dosen.usia15 > tertua.usia15) {
                tertua = dosen;
            }
        }
        System.out.println("=== Dosen Paling Tua ===");
        tertua.tampilkanInfo();;
    }

    static void infoDosenPalingMuda(Dosen15[] arrayOfDosen) {
        Dosen15 termuda = arrayOfDosen[0];
        for (Dosen15 dosen : arrayOfDosen) {
            if (dosen.usia15 < termuda.usia15) {
                termuda = dosen;
            }
        }
        System.out.println("=== Dosen Paling Muda ===");
        termuda.tampilkanInfo();;
    }
}
