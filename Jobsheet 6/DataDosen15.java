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
}
