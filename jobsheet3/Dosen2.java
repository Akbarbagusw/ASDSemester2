public class Dosen2 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen2(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo() {
        System.out.println("Kode \t\t: " + this.kode);
        System.out.println("Nama \t\t: " + this.nama);
        String jk = this.jenisKelamin ? "Pria" : "Wanita";
        System.out.println("Jenis Kelamin \t: " + jk);
        System.out.println("Usia \t\t: " + this.usia);
    }
}