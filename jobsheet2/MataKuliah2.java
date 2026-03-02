public class MataKuliah2 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah2() {
    }

    public MataKuliah2(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("--- INFORMASI MATA KULIAH ---");
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam + " jam");
        System.out.println("-----------------------------");
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("Pemberitahuan: SKS mata kuliah " + this.nama + " telah diubah menjadi " + this.sks + ".");
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Berhasil menambah " + jam + " jam. Jumlah Jam baru: " + this.jumlahJam + " jam.");
    }

    public void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Pengurangan berhasil. Jumlah Jam baru: " + this.jumlahJam + " jam."); // mencetak nilai jumlah jam yang baru
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam (" + this.jumlahJam + ") tidak mencukupi untuk dikurangi " + jam + " jam.");
        }
    }
}