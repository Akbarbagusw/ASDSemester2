import java.util.Scanner;
public class MataKuliahDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine();

        MataKuliah2[] arrayOfMataKuliah = new MataKuliah2[jumlahMataKuliah];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode  : ");
            kode = sc.nextLine();
            System.out.print("Nama  : ");
            nama = sc.nextLine();
            System.out.print("SKS   : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfMataKuliah[i] = new MataKuliah2();
            arrayOfMataKuliah [i].tambahData(kode, nama, sks, jumlahJam); 
        }

        for(int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-----------------------------");
        }
    }
}