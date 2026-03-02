public class DosenMain2 {
    public static void main(String[] args) {
        int tahunSaatIni = 2026;

        Dosen2 dsn1 = new Dosen2("D101", "Dr. Budi Santoso", true, 2010, "Kecerdasan Buatan");
        
        System.out.println("=== Objek 1: Dr. Budi Santoso ===");
        dsn1.tampilInformasi();

        int masaKerja1 = dsn1.hitungMasaKerja(tahunSaatIni); 
        System.out.println("Masa Kerja: " + masaKerja1 + " tahun.");
        
        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Pembelajaran Mesin (ML)");
        dsn1.tampilInformasi();

        System.out.println();

        Dosen2 dsn2 = new Dosen2();
        dsn2.idDosen = "D202";
        dsn2.nama = "Ibu Siti Aminah, M.Kom";
        dsn2.statusAktif = true;
        dsn2.tahunBergabung = 2020;
        dsn2.bidangKeahlian = "Basis Data";

        System.out.println("=== Objek 2: Ibu Siti Aminah, M.Kom ===");
        dsn2.tampilInformasi();

        int masaKerja2 = dsn2.hitungMasaKerja(tahunSaatIni);
        System.out.println("Masa Kerja: " + masaKerja2 + " tahun.");
        
        dsn2.ubahKeahlian("Keamanan Jaringan");
        dsn2.setStatusAktif(true);
    }
}