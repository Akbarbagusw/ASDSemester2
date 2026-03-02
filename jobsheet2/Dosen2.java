public class Dosen2 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen2() {
    }

    public Dosen2(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("--- INFORMASI DOSEN ---");
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("-----------------------");
    }

    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        String statusBaru = status ? "Aktif" : "Tidak Aktif";
        System.out.println("Status dosen " + this.nama + " berhasil diubah menjadi " + statusBaru + ".");
    }

    public int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - this.tahunBergabung;
        return masaKerja;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian dosen " + this.nama + " berhasil diubah menjadi " + bidang + ".");
    }
}