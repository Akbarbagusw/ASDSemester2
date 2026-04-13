public class MainLatihan {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[8];
        mhs[0] = new Mahasiswa("Ahmad", 220101001, 2022, 78, 82);
        mhs[1] = new Mahasiswa("Budi", 220101002, 2022, 85, 88);
        mhs[2] = new Mahasiswa("Cindy", 220101003, 2021, 90, 87);
        mhs[3] = new Mahasiswa("Dian", 220101004, 2021, 76, 79);
        mhs[4] = new Mahasiswa("Eko", 220101005, 2023, 92, 95);
        mhs[5] = new Mahasiswa("Fajar", 220101006, 2020, 88, 85);
        mhs[6] = new Mahasiswa("Gina", 220101007, 2023, 80, 83);
        mhs[7] = new Mahasiswa("Hadi", 220101008, 2020, 82, 84);

        OlahNilai olah = new OlahNilai();

        System.out.println("=== HASIL OLAH NILAI MAHASISWA ===");
        System.out.println("Nilai UTS Tertinggi: " + olah.cariMaxUTS(mhs, 0, mhs.length - 1));
        System.out.println("Nilai UTS Terendah: " + olah.cariMinUTS(mhs, 0, mhs.length - 1));
        System.out.println("Rata-rata Nilai UAS: " + olah.hitungRataUAS(mhs));
    }
}