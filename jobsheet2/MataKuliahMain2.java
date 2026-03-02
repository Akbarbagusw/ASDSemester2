public class MataKuliahMain2 {
    public static void main(String[] args) {
        MataKuliah2 mk1 = new MataKuliah2("A201", "Algoritma dan Struktur Data", 4, 8); // menggunakan konstruktor berparameter
        
        System.out.println("=== Objek 1: Algoritma dan Struktur Data ===");
        mk1.tampilInformasi();

        mk1.ubahSKS(3); 
        mk1.tampilInformasi();

        mk1.tambahJam(2);
        mk1.kurangiJam(5);
        mk1.kurangiJam(10);
        
        System.out.println();

        MataKuliah2 mk2 = new MataKuliah2();
        mk2.kodeMK = "T405";
        mk2.nama = "Pemrograman Berorientasi Objek";
        mk2.sks = 4;
        mk2.jumlahJam = 6;
        
        System.out.println("=== Objek 2: Pemrograman Berorientasi Objek ===");
        mk2.tampilInformasi();
        
        mk2.ubahSKS(5);
        mk2.tambahJam(4);
        mk2.kurangiJam(1);
    }
}