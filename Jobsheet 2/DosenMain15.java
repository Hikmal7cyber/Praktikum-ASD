public class DosenMain15 {
    public static void main(String[] args) {
        Dosen15 dosen1 = new Dosen15();
        dosen1.idDosen = "VNW";
        dosen1.statusAktif = true;
        dosen1.nama = "Vivi Nur Wijayaningrum, S.Kom., M.Kom.";
        dosen1.tahunBergabung = 2005;
        dosen1.bidangKeahlian = "Algoritma Dan Struktur Data";
        dosen1.tampilInformasi();
        
        System.out.println();

        Dosen15 dosen2 = new Dosen15("YWS", true, "Yan Watequlis Syaifudin, ST., MMT., Ph.D.", 2000, "Basis Data");
        dosen2.tampilInformasi();

        System.out.println();

        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Praktikum Basis Data");
        dosen2.tampilInformasi();
    }
}
