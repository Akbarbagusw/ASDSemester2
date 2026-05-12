import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antri = new AntrianKRS(10);
        int pilih;

        do {
            System.out.println("\n--- MENU ANTRIAN KRS DPA ---");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Proses KRS (Panggil 2 Mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Terdepan & Paling Akhir");
            System.out.println("5. Statistik & Sisa Kuota");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    antri.enqueue(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antri.layaniKRS();
                    break;
                case 3:
                    antri.printSemua();
                    break;
                case 4:
                    antri.peek2Terdepan();
                    antri.peekAkhir();
                    break;
                case 5:
                    antri.cetakStatistik();
                    break;
                case 6:
                    antri.clear();
                    break;
            }
        } while (pilih != 0);
    }
}