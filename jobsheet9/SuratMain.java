import java.util.Scanner;
public class SuratMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat tumpukan = new StackSurat(10);
        int pilih;

        do {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jns = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    tumpukan.push(new Surat(id, nama, kls, jns, durasi));
                    break;
                case 2:
                    Surat diproses = tumpukan.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat " + diproses.idSurat + " atas nama " + diproses.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat terakhir = tumpukan.peek();
                    if (terakhir != null) {
                        System.out.println("Surat teratas: " + terakhir.idSurat + " - " + terakhir.namaMahasiswa);
                    } else {
                        System.out.println("Tidak ada surat.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    tumpukan.cariSurat(cariNama);
                    break;
            }
        } while (pilih != 5);
    }
}