import java.util.Scanner;
public class MahasiswaDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi2 list = new MahasiswaBerprestasi2();
        int jmlMhs = 5;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM    : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama   : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Kelas  : ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK    : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa2 mhs = new Mahasiswa2(nim, nama, kelas, ipk);
            list.tambah(mhs);
            System.out.println("-------------------");
        }

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC):");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC):");
        list.insertionSort();
        list.tampil();
    }
}