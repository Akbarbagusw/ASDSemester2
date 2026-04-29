import java.util.Scanner;
public class SistemPeminjaman {
    public static void main(String[] args) {
        Mahasiswa[] m = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] b = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        Peminjaman[] p = {
            new Peminjaman(m[0], b[0], 7),
            new Peminjaman(m[1], b[1], 3),
            new Peminjaman(m[2], b[2], 10),
            new Peminjaman(m[2], b[3], 6),
            new Peminjaman(m[0], b[1], 4)
        };

        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa\n2. Tampilkan Buku\n3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda\n5. Cari Berdasarkan NIM\n0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mah : m) mah.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    for (Buku buk : b) buk.tampilBuku();
                    break;
                case 3:
                    System.out.println("Data Peminjaman:");
                    for (Peminjaman pem : p) pem.tampilPeminjaman();
                    break;
                case 4:
                    for (int i = 1; i < p.length; i++) {
                        Peminjaman temp = p[i];
                        int j = i - 1;
                        while (j >= 0 && p[j].denda < temp.denda) {
                            p[j + 1] = p[j];
                            j--;
                        }
                        p[j + 1] = temp;
                    }
                    System.out.println("Setelah diurutkan (Denda terbesar):");
                    for (Peminjaman pem : p) pem.tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNim = sc.nextLine();
                    boolean ditemukan = false;
                    for (Peminjaman pem : p) {
                        if (pem.mhs.nim.equals(cariNim)) {
                            pem.tampilPeminjaman();
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) System.out.println("Data tidak ditemukan.");
                    break;
            }
        } while (pilih != 0);
    }
}