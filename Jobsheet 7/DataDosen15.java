public class DataDosen15 {
    Dosen15[] listDosen = new Dosen15[10];
    int idx;

    DataDosen15(int jumlah) {
        listDosen = new Dosen15[jumlah];
        idx = 0;
    }

    void tambah(Dosen15 d) {
        if(listDosen.length >= idx) {
            listDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for(Dosen15 dosen : listDosen) {
            dosen.tampil();
            System.out.println("---------------------------------------");
        }
    }

    void ascendingBubbleSort() {
        for(int i = 0; i < listDosen.length -1; i++) {
            for(int j = 1; j < listDosen.length - i; j++) {
                if(listDosen[j].usia < listDosen[j-1].usia) {
                    Dosen15 tmp = listDosen[j];
                    listDosen[j] = listDosen[j-1];
                    listDosen[j-1] = tmp;
                }
            }
        }
    }

    void descendingSelectionSort() {
        for(int i = 0; i < listDosen.length - 1; i++) {
            int index = i;
            for(int j = i + 1; j < listDosen.length; j++) {
                if(listDosen[j].usia > listDosen[index].usia) {
                    index = j;
                }
            }
            Dosen15 tmp = listDosen[index];
            listDosen[index] = listDosen[i];
            listDosen[i] = tmp;
        }
    }

    void pencarianDataSequential15(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i < listDosen.length; i++) {
            if (listDosen[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("Data ditemukan pada indeks ke-" + i + ":");
                listDosen[i].tampil();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        }
    }

    void pencarianDataBinary15(int usia) {

        int left = 0;
        int right = listDosen.length - 1;
        boolean ditemukan = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (listDosen[mid].usia == usia) {
                ditemukan = true;
                System.out.println("Data ditemukan:");
                listDosen[mid].tampil();

                int i = mid - 1;
                while (i >= 0 && listDosen[i].usia == usia) {
                    listDosen[i].tampil();
                    i--;
                }

                int j = mid + 1;
                while (j < listDosen.length && listDosen[j].usia == usia) {
                    listDosen[j].tampil();
                    j++;
                }

                if (i != mid - 1 || j != mid + 1) {
                    System.out.println("Peringatan: Ditemukan lebih dari 1 dosen dengan usia " + usia);
                }
                return;
                
            } else if (usia < listDosen[mid].usia) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan.");
        }
    }
}
