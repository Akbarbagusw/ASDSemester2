public class MahasiswaMain2{
    public static void main(String[] args) {
        Mahasiswa2 mhs1 = new Mahasiswa2();
        mhs1.nama = "Akbar Bagus Wicaksana";
        mhs1.nim = "254107020067";
        mhs1.kelas = "TI-1H";
        mhs1.ipk = 3.7;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-1B");
        mhs1.updateIPK(3.9);
        mhs1.tampilkanInformasi();

        Mahasiswa2 mhs2 = new Mahasiswa2("Messi", "254107020068", 3.2, "TI-1C");
        mhs2.updateIPK(3.8);
        mhs2.tampilkanInformasi();
    }
}