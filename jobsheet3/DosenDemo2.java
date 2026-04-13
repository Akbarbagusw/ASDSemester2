import java.util.Scanner;
public class DosenDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen2[] arrayOfDosen = new Dosen2[jumlahDosen];

        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        for(int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode  : ");
            kode = sc.nextLine();
            System.out.print("Nama  : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            dummy = sc.nextLine();
            jenisKelamin = dummy.trim().equalsIgnoreCase("Pria");
            System.out.print("Usia : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfDosen[i] = new Dosen2(kode, nama, jenisKelamin, usia);
        }

        int counter = 1;
        for (Dosen2 dosen : arrayOfDosen) {
            System.out.println("\nData Dosen ke-" + counter);
            dosen.cetakInfo();
            counter++;
            System.out.println("-----------------------------");
        }

        DataDosen2.dataSemuaDosen(arrayOfDosen); // a
        DataDosen2.jumlahDosenPerJenisKelamin(arrayOfDosen); // b
        DataDosen2.rerataUsiaDosenPerJenisKelamin(arrayOfDosen); // c
        DataDosen2.infoDosenPalingTua(arrayOfDosen); // d
        DataDosen2.infoDosenPalingMuda(arrayOfDosen); // e
    }
}