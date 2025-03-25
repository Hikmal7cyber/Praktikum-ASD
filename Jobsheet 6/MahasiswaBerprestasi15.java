public class MahasiswaBerprestasi15 {
    Mahasiswa15 [] listMhs = new Mahasiswa15[5];
    int idx;

    void tambah(Mahasiswa15 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa15 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-1; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa15 tmp = listMhs [j];
                    listMhs [j] = listMhs [j-1];
                    listMhs [j-1] = tmp;
                }
            }
        }
    }
}
