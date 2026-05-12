public class Mahasiswa{
    String nim;
    String nama;
    String jurusan;
    String kelas;

    public Mahasiswa(String nim, String nama, String jurusan, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.kelas = kelas;
    }

    public void tampilkanData(){
        System.out.println(nim + " - " + nama + " - " + jurusan + " - " + kelas);
    }
}